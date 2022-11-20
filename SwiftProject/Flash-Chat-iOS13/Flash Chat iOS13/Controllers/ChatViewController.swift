//
//  ChatViewController.swift
//  Flash Chat iOS13
//
//  Created by Angela Yu on 21/10/2019.
//  Copyright © 2019 Angela Yu. All rights reserved.
//

import UIKit
import FirebaseCore
import FirebaseFirestore
import FirebaseAuth


class ChatViewController: UIViewController {
    
    @IBOutlet weak var tableView: UITableView!
    @IBOutlet weak var messageTextfield: UITextField!
    
    var db = Firestore.firestore()
    
    var messages: [Message] = [ ]
    
    
    @IBAction func logOutButtonPressed(_ sender: UIBarButtonItem) {
        let firebaseAuth = Auth.auth()
        do {
            try firebaseAuth.signOut()
            navigationController?.popToRootViewController(animated: true)
            
        } catch let signOutError as NSError {
            print("Error signing out: %@", signOutError)
        }
        
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        tableView.dataSource = self
        navigationItem.hidesBackButton = true
        navigationItem.title = K.appName        
        tableView.register(UINib(nibName: K.cellNibName, bundle: nil), forCellReuseIdentifier: K.cellIdentifier)
        
        // 화면이 시작될때, FireStore에 있는 Collection을 읽어서 화면 업데이트 해주는 func
        loadMessages()
    }
    
    func loadMessages(){
      
        // getDocuments 사용해서 QuerySnapShot을 return 받을 수 있음
        // QuerySnapShot -> Query - > Document -> Collections -> Sender / Message
        
        db.collection(K.FStore.collectionName)
            .order(by: K.FStore.dateField)
            .addSnapshotListener{ querySnapshot, error in
            
            self.messages = []
            
            
            if let e = error {
                print("ERROR")
            }else{
                if ((querySnapshot?.isEmpty) != nil){
                    for document in querySnapshot!.documents {
                        let data = document.data()
                        
                        //data[sender] 가 Any 타입이기에, as? 으로 Down Casting
                        if let messageSender = data[K.FStore.senderField] as? String , let messageBody = data[K.FStore.bodyField] as? String {
                            let newMessage = Message(sender: messageSender, body: messageBody)
                            self.messages.append(newMessage)
                            
                            //Closure 안에서 발생하는 것이기 때문에, main Thread을 통해서 업데이트 하는것이 바람직.
                            DispatchQueue.main.async {
                                self.tableView.reloadData()
                                self.messageTextfield.text = ""
                                
                                let indexPath = IndexPath(row: self.messages.count - 1, section: 0)
                                self.tableView.scrollToRow(at: indexPath, at: .top, animated: true)
                            }
                        }
                    }
                }
            }
        }
    }
    @IBAction func sendPressed(_ sender: UIButton) {
        if let messageBody = messageTextfield.text , let messageSender = Auth.auth().currentUser?.email{
            db.collection(K.FStore.collectionName).addDocument(data: [
                K.FStore.senderField : messageSender, K.FStore.bodyField : messageBody, K.FStore.dateField : Date().timeIntervalSince1970
            ]) { (error) in
                if let e = error {
                    print("Some Error")
                }else{
                    print("Successfully saved Data")
                }
            }
        }
        
    }
}

extension ChatViewController : UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return messages.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        let message = messages[indexPath.row]
        let cell = tableView.dequeueReusableCell(withIdentifier: K.cellIdentifier, for: indexPath) as! MessageCell
        cell.Label.text = messages[indexPath.row].body
        
        if message.sender == Auth.auth().currentUser?.email{
            cell.leftImageView.isHidden = true
            cell.rightImageView.isHidden = false
            cell.MessageBubble.backgroundColor = UIColor(named: K.BrandColors.lightPurple)
            cell.Label.textColor = UIColor(named: K.BrandColors.purple)
        }else{
            cell.leftImageView.isHidden = false
            cell.rightImageView.isHidden = true
            cell.MessageBubble.backgroundColor = UIColor(named: K.BrandColors.purple)
            cell.Label.textColor = UIColor(named: K.BrandColors.lightPurple)
        }
        
        
        return cell
    }
}


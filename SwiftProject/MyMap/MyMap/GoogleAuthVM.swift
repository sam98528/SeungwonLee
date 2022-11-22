//
//  GoogleAuthVM.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/22.
//

import SwiftUI
import FirebaseCore
import FirebaseAuth
import GoogleSignInSwift
import GoogleSignIn


class GoogleAuthVM : ObservableObject{
    
    @Published var isLoggedIn : Bool = false
    
    func handleGoogleLogin (){
        guard let clientID = FirebaseApp.app()?.options.clientID else { return }

        // Create Google Sign In configuration object.
        let config = GIDConfiguration(clientID: clientID)

        // Start the sign in flow!
        GIDSignIn.sharedInstance.signIn(with: config, presenting: ApplicationUtility.rootViewController) { [self] user, error in

          if let error = error {
              print(error.localizedDescription)
            return
          }

          guard
            let authentication = user?.authentication,
            let idToken = authentication.idToken
          else {
            return
          }

          let credential = GoogleAuthProvider.credential(withIDToken: idToken,
                                                         accessToken: authentication.accessToken)
            
            Auth.auth().signIn(with: credential) { result, error in
                
                if let err = error {
                    print(err.localizedDescription)
                    return
                }
                
                guard let user = result?.user else{ return }
                print(user.displayName!)
                
                self.isLoggedIn.toggle()
            }
          // ...
        }
        
    }
    
   
    
}

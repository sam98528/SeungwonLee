////
////  GoogleAuthVM.swift
////  MyMap
////
////  Created by Sam.Lee on 2022/11/22.
////
//
//import SwiftUI
//import FirebaseCore
//import FirebaseAuth
//import GoogleSignInSwift
//import GoogleSignIn
//
//
//class GoogleAuthVM : ObservableObject{
//
//
//    func handleSignInButton() {
//        guard let clientID = FirebaseApp.app()?.options.clientID else { return }
//
//        // Create Google Sign In configuration object.
//        let config = GIDConfiguration(clientID: clientID)
//
//        // Start the sign in flow!
//        GIDSignIn.sharedInstance.signIn(with: config, presenting: self) { [unowned self] user, error in
//
//          if let error = error {
//            // ...
//            return
//          }
//
//          guard
//            let authentication = user?.authentication,
//            let idToken = authentication.idToken
//          else {
//            return
//          }
//
//          let credential = GoogleAuthProvider.credential(withIDToken: idToken,
//                                                         accessToken: authentication.accessToken)
//
//          // ...
//        }
//
//    }
//
//}

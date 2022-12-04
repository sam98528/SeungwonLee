//import SwiftUI
//import FacebookCore
//import FacebookLogin
//
//class FacebookLoginManager: ObservableObject {
//    let loginManager = LoginManager()
//    func facebookLogin() {
//        loginManager.logIn(permissions: [.publicProfile, .email], viewController: nil) { loginResult in
//            switch loginResult {
//            case .failed(let error):
//                print(error)
//            case .cancelled:
//                print("User cancelled login.")
//            case .success(let grantedPermissions, let declinedPermissions, let accessToken):
//                print("Logged in! \(grantedPermissions) \(declinedPermissions) \(accessToken)")
//                GraphRequest(graphPath: "me", parameters: ["fields": "id, name, first_name"]).start(completionHandler: { (connection, result, error) -> Void in
//                    if (error == nil){
//                        let fbDetails = result as! NSDictionary
//                        print(fbDetails)
//                    }
//                })
//            }
//        }
//    }
//}

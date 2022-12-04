//
//  MySceneDelegate.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import Foundation
import UIKit
import KakaoSDKAuth
import FacebookCore

class MySceneDelegate: UIResponder, UIWindowSceneDelegate {
    
    func scene(_ scene: UIScene, openURLContexts URLContexts: Set<UIOpenURLContext>) {
        if let url = URLContexts.first?.url {
            if (AuthApi.isKakaoTalkLoginUrl(url)) {
                _ = AuthController.handleOpenUrl(url: url)
            }
        }
        
        
        guard let url = URLContexts.first?.url else {
            return
        }

        ApplicationDelegate.shared.application(
            UIApplication.shared,
            open: url,
            sourceApplication: nil,
            annotation: [UIApplication.OpenURLOptionsKey.annotation]
        )
        
        
    }


}


// Add this to the header of your file, e.g. in ViewController.swift

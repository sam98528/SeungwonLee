//
//  MyAppDelegate.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import Foundation
import UIKit
import KakaoSDKCommon
import KakaoSDKAuth
import FirebaseCore
import FirebaseFirestore
import FirebaseAuth
import NMapsMap

class MyAppDelegate: UIResponder, UIApplicationDelegate {
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        
        let kakaoAppKey = Bundle.main.infoDictionary?["KAKAO_NATIVE_APP_KEY"] ?? ""
        //Kakao SDK 초기화
        KakaoSDK.initSDK(appKey: kakaoAppKey as! String)
        
        
        // Firebase 초기화
        FirebaseApp.configure()

        let NMFClientId = Bundle.main.infoDictionary?["NMFClientId"] ?? ""
        NMFAuthManager.shared().clientId = (NMFClientId as! String)
        
        
        print("Kakao API KEY : \(kakaoAppKey)")
        return true
        
    }
    
    
    func application(_ application: UIApplication, configurationForConnecting connectingSceneSession: UISceneSession, options: UIScene.ConnectionOptions) -> UISceneConfiguration {
        
        let sceneConfiguration = UISceneConfiguration(name: nil, sessionRole: connectingSceneSession.role)
        
        sceneConfiguration.delegateClass = MySceneDelegate.self
        
        return sceneConfiguration
    }
    
    
}

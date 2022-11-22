//
//  MyMapApp.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import SwiftUI
import KakaoSDKCommon
import KakaoSDKAuth



@main
struct MyMapApp: App {
    
    @UIApplicationDelegateAdaptor var appDelegate : MyAppDelegate
    
// SWIFT UI APP 초기화 방법
//    init() {
//
//        let kakaoAppKey = Bundle.main.infoDictionary?["KAKAO_NATIVE_APP_KEY"] ?? ""
//            // Kakao SDK 초기화
//            KakaoSDK.initSDK(appKey: kakaoAppKey as! String)
//        }
    
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

//
//  KakaoAuthVM.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import Foundation
import Combine
import KakaoSDKAuth
import KakaoSDKUser


class KakaoAuthVM : ObservableObject {
    
    @Published var isLoggedIn : Bool = false
    
    @MainActor
    func kakaoLogout(){
        Task {
            if await handleKakaoLogout() {
                isLoggedIn = false
            }
        }
    }
    
    func handleKakaoLogout() async -> Bool{
        
        await withCheckedContinuation{ contination in
            UserApi.shared.logout {(error) in
                if let error = error {
                    print(error)
                    contination.resume(returning: false)
                }
                else {
                    print("logout() success.")
                    contination.resume(returning: true)
                }
            }
        }
    }
    
    
    func handleLoginWithKakaoTalkApp() async-> Bool {
        
        await withCheckedContinuation{ continuation in
            UserApi.shared.loginWithKakaoTalk {(oauthToken, error) in
                if let error = error {
                    print(error)
                    continuation.resume(returning: false)
                }
                else {
                    print("loginWithKakaoTalk() success.")
                    //do something
                    _ = oauthToken
                    continuation.resume(returning: true)
                }
            }
        }
        
    }
    
    func handleLoginWithKakaoAccount () async -> Bool {
        await withCheckedContinuation{continuation in
            UserApi.shared.loginWithKakaoAccount {(oauthToken, error) in
                if let error = error {
                    print(error)
                    continuation.resume(returning: false)
                }
                else {
                    print("loginWithKakaoAccount() success.")
                    //do something
                    _ = oauthToken
                    continuation.resume(returning: true)
                }
            }
            
        }
    }
    
    @MainActor
    func handleKakaoLogin(){
        Task {
            //카카오톡 설치 여부 확인 -- 설치 되어 있을때
            if (UserApi.isKakaoTalkLoginAvailable()) {
                isLoggedIn = await handleLoginWithKakaoTalkApp()
            }
            else { //카카오톡 설치 여부 확인 -- 설치 안되어 있을때 웹뷰를
                //카카오 웹뷰로 로그인
                isLoggedIn = await handleLoginWithKakaoAccount()
            }
        }
    }
    
    func handleKakaoLogout(){
        UserApi.shared.logout {(error) in
            if let error = error {
                print(error)
            }
            else {
                print("logout() success.")
            }
        }
    }
    
}

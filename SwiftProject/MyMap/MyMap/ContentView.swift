//
//  ContentView.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import SwiftUI

struct ContentView: View {
    
    @StateObject var kakaoAuthVM : KakaoAuthVM = KakaoAuthVM()
    
    
    let loginStatusInfo : (Bool) -> String = { isLoggedIn in
        return isLoggedIn ? "로그인 상태" : "로그아웃 상태"
    }
    
    var body: some View {
        VStack(spacing: 20) {
            Text(loginStatusInfo(kakaoAuthVM.isLoggedIn))
                .padding()
            Button( action: {
                kakaoAuthVM.handleKakaoLogin()
            }) {
                Image("kakao_login_button")
                    .renderingMode(.original)
            }
            Button("카카오 로그아웃", action: {
                kakaoAuthVM.kakaoLogout()
            })
//            Button("Google Login", action:) {
//
//            }
        }
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

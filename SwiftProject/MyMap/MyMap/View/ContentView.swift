//
//  ContentView.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import SwiftUI
import GoogleSignInSwift

struct ContentView: View {
    
    @StateObject var kakaoAuthVM : KakaoAuthVM = KakaoAuthVM()
    @StateObject var googleAuthVM : GoogleAuthVM = GoogleAuthVM()
    
    let loginStatusInfo : (Bool) -> String = { isLoggedIn in
        return isLoggedIn ? "LOG IN" : "LOG OUT"
    }
    
    var body: some View {
        if (kakaoAuthVM.isLoggedIn || googleAuthVM.isLoggedIn){
            NaverMapView()
        }else{
            VStack(spacing: 20) {
                HStack {
                    Text("KAKAO \(loginStatusInfo(kakaoAuthVM.isLoggedIn))")
                        .padding()
                        .background(.yellow)
                        .font(.headline)
                    .bold()
                    
                    Text("GOOGLE \(loginStatusInfo(googleAuthVM.isLoggedIn))")
                        .padding()
                        .background(.blue)
                        .font(.headline)
                        .bold()
                        .foregroundColor(.white)
                }

                Button( action: {
                    kakaoAuthVM.handleKakaoLogin()
                }) {
                    Image("kakao_login_button")
                        .renderingMode(.original)
                }
            
                Button(action: {
                    googleAuthVM.handleGoogleLogin()
                }){
                    Image("google_login_button")
                }

                
                Button("카카오 로그아웃", action: {
                    kakaoAuthVM.kakaoLogout()
                })
            }
        }
            
            
            
        
        
        
        
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

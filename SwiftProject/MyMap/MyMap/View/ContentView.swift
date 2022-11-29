//
//  ContentView.swift
//  MyMap
//
//  Created by Sam.Lee on 2022/11/21.
//

import SwiftUI
import GoogleSignInSwift
import AuthenticationServices


struct ContentView: View {
    
    @StateObject var kakaoAuthVM : KakaoAuthVM = KakaoAuthVM()
    @StateObject var googleAuthVM : GoogleAuthVM = GoogleAuthVM()
    
    let loginStatusInfo : (Bool) -> String = { isLoggedIn in
        return isLoggedIn ? "LOG IN" : "LOG OUT"
    }
    
    
    init(){
        for family in UIFont.familyNames {
             print(family)

             for names in UIFont.fontNames(forFamilyName: family){
             print("== \(names)")
             }
        }
    }
    
    var body: some View {
        if (kakaoAuthVM.isLoggedIn || googleAuthVM.isLoggedIn){
            NaverMapView()
        }else{
            ZStack{
                Image("background")
                    .resizable()
                    .scaledToFill()
                    .frame(width: 100, alignment: .center)
                    .ignoresSafeArea()
                VStack(spacing: 20) {
                    Spacer()
                    Text("MYMAP")
                        .font(Font.custom("CollegiateFLF", size: 80))
                        .fontWeight(.bold)
                        .foregroundColor(.white)
                    
                        
                    Spacer()
                    Spacer()
//                    HStack {
//                        Text("KAKAO \(loginStatusInfo(kakaoAuthVM.isLoggedIn))")
//                            .padding()
//                            .background(.yellow)
//                            .font(.headline)
//                        .bold()
//
//                        Text("GOOGLE \(loginStatusInfo(googleAuthVM.isLoggedIn))")
//                            .padding()
//                            .background(.blue)
//                            .font(.headline)
//                            .bold()
//                            .foregroundColor(.white)
//                    }

                    Button( action: {
                        print("SOMETHING")
                    }) {
                        Image("apple_login_button")
                            
                    }
                    
                    Button( action: {
                        kakaoAuthVM.handleKakaoLogin()
                    }) {
                        Image("kakao_login_button")
                            .renderingMode(.original)
                            .resizable()
                            .frame(width: 180,height: 45)
                    }
                    Button(action: {
                        googleAuthVM.handleGoogleLogin()
                    }){
                        Image("google_login_button")
                            .resizable()
                            .frame(width: 180,height: 45)
                    }
                    Button( action: {
                        print("SOMETHING")
                    }) {
                        Image("facebook_login_button")
                            .resizable()
                            .frame(width: 180,height: 45)
                            
                    }
                    Spacer()
                
                }
            }
            
        }
            
            
            
        
        
        
        
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

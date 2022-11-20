//
//  ContentView.swift
//  PersonalCard
//
//  Created by Sam.Lee on 2022/11/16.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        ZStack{
            Color(red: 0.09 , green: 0.63, blue: 0.52)
                .ignoresSafeArea(.all)
            VStack{
                
                Image("myPhoto")
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: 200.0, height: 150.0)
                    .clipShape(Circle())
                    .overlay(
                        Circle().stroke(Color.white, lineWidth: 0.5)
                    )
                
                Text("Seungwon Lee")
                    .font(Font.custom("Pacifico-Regular", size: 40))
                    .bold()
                    .foregroundColor(.white)
                Text("iOS Developer")
                    .foregroundColor(.white)
                    .font(.title2)
                Divider()
                InfoView(text: "+82 010-4201-0538", imageName: "phone.fill")
                InfoView(text: "sam98528@naver.com", imageName: "envelope.fill")

            }
        }
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}


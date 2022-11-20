//
//  ContentView.swift
//  I Am Rich
//
//  Created by Sam.Lee on 2022/11/16.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        ZStack{
            Color(red: 0.5, green: 0.5, blue: 0.5)
                .edgesIgnoringSafeArea(.all)
            VStack {
                Text("I am Rich")
                    .font(.headline)
                    .fontWeight(.bold)
                    .foregroundColor(Color.white)
                Image("diamond")
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: 200,height: 200,alignment: .center)
            }
            
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

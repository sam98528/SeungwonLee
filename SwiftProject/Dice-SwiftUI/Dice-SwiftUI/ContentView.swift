//
//  ContentView.swift
//  Dice-SwiftUI
//
//  Created by Sam.Lee on 2022/11/16.
//

import SwiftUI

struct ContentView: View {
    
    @State var leftDiceNum = 1
    @State var rightDiceNum = 1
    
    
    var body: some View {
        ZStack {
            Image("background")
                .resizable()
                .edgesIgnoringSafeArea(.all)
            VStack {
                Image("diceeLogo")
                Spacer()
                HStack {
                    DiceView(n: leftDiceNum)
                    DiceView(n: rightDiceNum)
                }
                .padding(.horizontal)
                
                Spacer()
                
                Text("Total : \(leftDiceNum + rightDiceNum)")
                    .foregroundColor(.red)
                    .font(.title)
                    .fontWeight(.heavy)
                
                Spacer()
                
                Button(action: {
                    self.leftDiceNum = Int.random(in: 1...6)
                    self.rightDiceNum = Int.random(in: 1...6)
                }, label: {
                    Text("Roll")
                        .font(.system(size: 50))
                        .fontWeight(.heavy)
                        .foregroundColor(.white)
                        .padding(.horizontal)
                })
                .background(Color.blue)
                .padding(.bottom)
                
               
               
                
            }
            
            
            
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct DiceView: View {
    
    let n : Int
    
    var body: some View {
        Image("dice\(n)")
            .resizable()
            .aspectRatio(1, contentMode: .fit)
            .padding()
    }
}

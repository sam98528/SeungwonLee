//
//  ContentView.swift
//  H4XOR News
//
//  Created by Sam.Lee on 2022/12/05.
//

import SwiftUI

struct ContentView: View {
    
    @ObservedObject var networkManger = NetworkManager()
    
    
    
    var body: some View {
        NavigationStack{
            List(networkManger.posts) { post in
                HStack {
                    Text(String(post.points))
                    Text(post.title)
                }
            }
            .navigationBarTitle("H4XOR NEWS")
        }
        
        .onAppear{
            self.networkManger.fetchData()
        }
    }
    
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}



//
//  ContentView.swift
//  H4XOR News
//
//  Created by Sam.Lee on 2022/12/05.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationStack{
            List(posts) { post in
                Text(post.title)
            }
            .navigationBarTitle("H4XOR NEWS")
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}



struct Post : Identifiable{
    
    let id : String
    let title : String
    
}

let posts = [
    Post(id: "1", title: "Hello"),
    Post(id: "2", title: "Hello2"),
    Post(id: "3", title: "Hello3")
]

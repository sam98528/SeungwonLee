//
//  PostData.swift
//  H4XOR News
//
//  Created by Sam.Lee on 2022/12/05.
//

import Foundation


struct Results : Decodable {

    let hits : [Post]
}


struct Post : Decodable, Identifiable {
    var id : String {
        return objectID
    }
    let objectID : String
    let points : Int
    let title : String
    let url : String?
    
}

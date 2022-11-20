//
//  Question.swift
//  Quizzler-iOS13
//
//  Created by Sam.Lee on 2022/10/12.
//  Copyright © 2022 The App Brewery. All rights reserved.
//

import Foundation

struct Question {
    let text : String
    let answer : String
    
    init(q: String, a: String) {
        text = q
        answer = a
    }
    
}

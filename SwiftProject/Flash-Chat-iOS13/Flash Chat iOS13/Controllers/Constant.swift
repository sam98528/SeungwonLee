//
//  Constant.swift
//  Flash Chat iOS13
//
//  Created by Sam.Lee on 2022/11/11.
//  Copyright © 2022 Angela Yu. All rights reserved.
//


struct K {
    static let appName = "⚡️FlashChat"
    static let cellIdentifier = "ReusableCell"
    static let cellNibName = "MessageCell"
    static let registerSuccessSegue = "registerSuccessSegue"
    static let loginSuccessSegue = "loginSuccessSegue"
    
    struct BrandColors {
        static let purple = "BrandPurple"
        static let lightPurple = "BrandLightPurple"
        static let blue = "BrandBlue"
        static let lightBlue = "BrandLightBlue"
    }
    
    struct FStore {
        static let collectionName = "messages"
        static let senderField = "sender"
        static let bodyField = "body"
        static let dateField = "date"
    }
}

//
//  CoinModel.swift
//  ByteCoin
//
//  Created by Sam.Lee on 2022/10/26.
//  Copyright © 2022 The App Brewery. All rights reserved.
//

import Foundation


struct CoinModel {
    let currencyName : String
    let rate : Double
    
    var rateString : String {
        return String(format: "%.2f", rate)
    }
}

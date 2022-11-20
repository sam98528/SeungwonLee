//
//  WeatherData.swift
//  Clima
//
//  Created by Sam.Lee on 2022/10/25.
//  Copyright © 2022 App Brewery. All rights reserved.
//

import Foundation

struct WeatherData:Decodable {
    let name : String
    let main : Main
    let weather : [Weather]
}


struct Main :Decodable{
    let temp : Double
}

struct Weather :Decodable{
    let id : Int
}

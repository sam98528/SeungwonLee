//
//  CalculatorBrain.swift
//  BMI Calculator
//
//  Created by Sam.Lee on 2022/10/18.
//  Copyright © 2022 Angela Yu. All rights reserved.
//

import UIKit


struct CalculatorBrain{
    
    var bmi : BMI?
    
    mutating func bmiCalculation(weight : Float, height : Float){
        let bmiValue = weight / pow(height, 2)
        var advice : String
        var color : UIColor
        
        if(bmiValue < 18.5){
            advice = "더 먹어라"
            color = #colorLiteral(red: 0.4745098054, green: 0.8392156959, blue: 0.9764705896, alpha: 1)
        }else if (bmiValue < 24.9){
            advice = "지금 유지해라"
            color = #colorLiteral(red: 0.5843137503, green: 0.8235294223, blue: 0.4196078479, alpha: 1)
        }else{
            advice = "적당히 처먹어라"
            color = #colorLiteral(red: 0.8549019694, green: 0.250980407, blue: 0.4784313738, alpha: 1)
        }
        
        bmi = BMI(value: bmiValue, advice: advice, color: color)
    }
    
    
    func getBMIValue() -> String {
        return String(format: "%0.1f", bmi?.value ?? 0.0)
    }
    
    func getColor() -> UIColor {
        return bmi?.color ?? .blue
    }
    
    func getAdvice() -> String {
        return bmi?.advice ?? "No Advice"
    }
    
}

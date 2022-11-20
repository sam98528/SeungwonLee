//
//  ViewController.swift
//  Tipsy
//
//  Created by Angela Yu on 09/09/2019.
//  Copyright © 2019 The App Brewery. All rights reserved.
//

import UIKit

class CalculatorViewController: UIViewController {

    var calculatorBrain = CalculatorBrain()
    
    @IBOutlet weak var billTextField: UITextField!
    @IBOutlet weak var zeroPctButton: UIButton!
    @IBOutlet weak var tenPctButton: UIButton!
    @IBOutlet weak var twentyPctButton: UIButton!
    @IBOutlet weak var splitNumberLabel: UILabel!
    

    
    
    @IBAction func tipChanged(_ sender: UIButton) {
        zeroPctButton.isSelected = false
        tenPctButton.isSelected = false
        twentyPctButton.isSelected = false
        
        sender.isSelected = true

        calculatorBrain.tipCalculation(sender.currentTitle!)

    }
    
    @IBAction func stepperValueChanged(_ sender: UIStepper) {
        splitNumberLabel.text = String(format: "%0.f", sender.value)
        
        calculatorBrain.numberOfPeopleCheck(num: sender.value)
    }
    
    @IBAction func calculatePressed(_ sender: UIButton) {
        
        calculatorBrain.billResultCalculation(totalBill: billTextField.text!)
        
        

        self.performSegue(withIdentifier: "calculatedResult", sender: self)
        
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "calculatedResult"{
            let destinationVC = segue.destination as! ResultViewController
            
            destinationVC.resultCalculator = calculatorBrain
            
        }
    }


}


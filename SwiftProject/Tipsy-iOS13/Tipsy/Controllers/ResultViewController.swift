//
//  ResultViewController.swift
//  Tipsy
//
//  Created by Sam.Lee on 2022/10/19.
//  Copyright © 2022 The App Brewery. All rights reserved.
//

import UIKit

class ResultViewController: UIViewController {
    
    @IBOutlet weak var totalLabel: UILabel!
    @IBOutlet weak var settingsLabel: UILabel!
    
    
    var resultCalculator = CalculatorBrain()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        totalLabel.text = resultCalculator.billResult
        settingsLabel.text = "Split Between \(resultCalculator.numberOfPeople) people, with \(resultCalculator.tip * 100)% tip"
        // Do any additional setup after loading the view.
    }
    
    @IBAction func recalculatePressed(_ sender: UIButton) {
        self.dismiss(animated: true)
    }
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}

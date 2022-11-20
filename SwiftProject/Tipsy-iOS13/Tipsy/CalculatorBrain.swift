import UIKit


struct CalculatorBrain{
    
    var tip : Double = 0.0
    var billResult : String = "0.0"
    var numberOfPeople : Int = 0
    var totalBill : Double = 0.0
    
    mutating func tipCalculation(_ percentage: String){
        let numbersString = String(percentage.dropLast())
        tip = Double(numbersString)!
        tip = tip / 100
    }
    
    mutating func numberOfPeopleCheck(num : Double){
        let numberText = String(format: "%.f", num)
        numberOfPeople = Int(numberText)!
    }
    
    mutating func billResultCalculation (totalBill : String){
        
        if(totalBill != ""){
            let billDouble = Double(totalBill)! * (1 + self.tip) / Double(self.numberOfPeople)
            
            billResult = String(format: "%0.2f", billDouble)
        }
        
    }
}


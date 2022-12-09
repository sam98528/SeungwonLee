import Foundation

func solution(_ food:[Int]) -> String {
    var answer = [Int]()
   
    for i in 1...food.count-1{
        if food[i] != 1 {
            for _ in 1...food[i]/2{
                answer.append(i)
            }
            
        }
    }
    
    var reverseAnswer = answer.reversed()
    
    answer.append(0)
    answer += reverseAnswer
    
    var stringArray = answer.map { String($0) }
    var stringAnswer =  stringArray.joined()
    
    //print(stringAnswer)
    return stringAnswer
}
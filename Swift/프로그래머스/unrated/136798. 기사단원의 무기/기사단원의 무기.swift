import Foundation

func solution(_ number:Int, _ limit:Int, _ power:Int) -> Int {
    var soliderArray = [Int]()
    var answer : Int = 0
    
    for i in 1...number{
        var eachNum : Int = 0
        for j in 1 ... Int(sqrt(Double(i))){
            if i % j == 0 {
                eachNum = eachNum + 1
                if (j != i / j){
                    eachNum = eachNum + 1
                }
            }
        }
        soliderArray.append(eachNum)
    }
    
    for num in soliderArray {
        if num > limit {
            answer += power
        }else{
            answer += num
        }
    }
    
    //print(answer)
    //print(soliderArray)
    return answer
}
import Foundation

func solution(_ s:String) -> Int {
    var answer : Int = 0
    var strArray = Array(s)
    var i : Int = 0
    
    while i < strArray.count {
        let x = strArray[0]
        var same : Int = 1
        var diff : Int = 0
        //print(strArray)
        
        strArray.removeFirst()
        while same != diff && i < strArray.count{
            if strArray[i] == x {
                same = same + 1
            }else {
                diff = diff + 1
            }
            strArray.removeFirst()
        }

        answer = answer + 1
    }
    
    
    return answer
}
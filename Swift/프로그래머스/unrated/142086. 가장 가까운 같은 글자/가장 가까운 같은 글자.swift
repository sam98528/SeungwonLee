import Foundation

func solution(_ s:String) -> [Int] {
   var solArray = [Int]()
    let stringArray = Array(s)
    
    for i in 0...stringArray.count-1 {
        if i == 0 {
            solArray.append(-1)
        }else{
            let subArray = stringArray[0...i-1]
            if let lastindex = subArray.lastIndex(of: stringArray[i]) {
                solArray.append(i-lastindex)
            }else{
                solArray.append(-1)
            }
        }
    }
    
    return solArray
}
import Foundation

func solution(_ k:Int, _ score:[Int]) -> [Int] {
    var solutionArray = [Int]()
    
    for i in 0...score.count-1 {
        var kBoard = score[0...i]
        kBoard.sort(by: {$0 > $1 })
        if (kBoard.count <= k){
            solutionArray.append(kBoard[kBoard.count-1])
        }else{
            solutionArray.append(kBoard[k-1])
        }
        //print(kBoard)
    }
    
    //print(solutionArray)
    return solutionArray
}
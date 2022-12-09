import Foundation

func solution(_ k:Int, _ m:Int, _ score:[Int]) -> Int {
    var answer = 0
    var score = score.sorted{$0 > $1}
    var start = m-1
    while start < score.count {        
        answer += m*score[start]        
        start += m
    }

    return answer
}
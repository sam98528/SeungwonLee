import java.util.*;


class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        
        answer = money - countMoney(price,count);
        if (answer > 0){
            answer = 0;
        }else{
            answer *= -1;
        }
        return answer;
    }
    
    public long countMoney(int price, int count){
        long total = 0;
        
        for(long i = 1; i <= count; i++){
            total += price * i;
        }
        
        return total;
    }
}
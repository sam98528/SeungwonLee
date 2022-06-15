import java.util.*;


class Solution {
    public String solution(int n) {
        String [] numbers = {"4" , "1" , "2"};
        String answer = "";
        while(n > 0){
            answer += numbers[n%3];
            if(n % 3 == 0){
                n = (n/3)- 1;
            }else{
                n /= 3;
            }
        }
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}
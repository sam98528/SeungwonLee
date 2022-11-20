import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int three = 1;
        ArrayList <Integer> arr = new ArrayList<>();
        
        while(n != 0){
            arr.add(n % 3);
            n /= 3;
        }
        for(int i = arr.size() - 1; i >= 0; i--){
            answer += arr.get(i) * three;
            three *= 3;
        }
        return answer;
    }
}
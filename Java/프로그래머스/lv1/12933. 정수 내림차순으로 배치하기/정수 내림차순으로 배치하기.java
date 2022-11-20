import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        ArrayList <Long> index = new ArrayList<>();
        while(n != 0){
            long temp = n % 10;
            index.add(temp);
            n /= 10;
        }
       long answer = ans(index);
        return answer;
    }
    
    public long ans (ArrayList <Long> temp){
        long answer = 0;
        long times = 1;
        for(int i = 1; i < temp.size(); i++){
            for(int j = 0; j < temp.size()-i ; j++){
                if(temp.get(j) < temp.get(j+1)){
                long temp1 = temp.get(j);
                temp.set(j,temp.get(j+1));
                temp.set(j+1, temp1);
                }      
            }
        }
        
        for(int i = temp.size()-1; i >= 0 ;i--){
            answer += temp.get(i) * times;
            times *= 10;
        }
        return answer;
    }

}
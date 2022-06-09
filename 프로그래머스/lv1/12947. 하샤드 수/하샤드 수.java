import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        ArrayList <Integer> arrNum = new ArrayList<>();
        int temp = x;
        int sum = 0;
        
        while(x > 0){
            arrNum.add(x % 10);
            x =  x / 10;
        }
        
        for(int i = 0; i < arrNum.size(); i++){
            sum += arrNum.get(i);
        }
        if(temp % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}
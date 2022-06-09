import java.util.*;
import java.io.*;


class Solution {
    public ArrayList <Long> solution(long n) {
        ArrayList <Long> answer = new ArrayList<Long>();
        long temp = 0;
        while(n != 0){
            temp = n % 10;
            answer.add(temp);
            n /= 10;
        }
        
        return answer;
    }
}
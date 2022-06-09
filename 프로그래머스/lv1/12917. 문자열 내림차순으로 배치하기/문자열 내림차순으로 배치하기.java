import java.util.*;


class Solution {
    public String solution(String s) {
        String answer = "";
        String [] temp = s.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < temp.length; i++){
            for(int j = 0; j < temp.length - i; j++){
                if((int)temp[j].charAt(0) < (int)temp[j+1].charAt(0)){
                    String temp1 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp1;
                }
            }
        }
        
        for(int i = 0; i < temp.length; i++){
            sb.append(temp[i].charAt(0));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
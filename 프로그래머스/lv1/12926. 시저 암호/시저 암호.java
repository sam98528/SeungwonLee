import java.util.*;
import java.io.*;


class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String [] temp = s.split("");
        StringBuilder sb = new StringBuilder();
        int a = 0;
        
        for(int i = 0; i < temp.length;i++){
            a = 0;
            if(temp[i].charAt(0) != ' '){
                if((int)(temp[i].charAt(0)) <= 90 && (int)(temp[i].charAt(0))+n > 90){
                    a = (int)(temp[i].charAt(0))+n - 90 + 64;
                    sb.append((char)a);
                } 
                else if ((int)(temp[i].charAt(0)) <= 122 && (int)(temp[i].charAt(0))+n > 122 ){
                    a = (int)(temp[i].charAt(0))+n - 123 + 97;
                    sb.append((char)a);
                }else{
                       sb.append((char)((int)(temp[i].charAt(0))+n));
                }
            }else{
                sb.append(temp[i].charAt(0));
            }
           
        }
        answer = sb.toString();
        
        
        return answer;
    }
}
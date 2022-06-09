import java.util.*;


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        String [] arr = s.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].toLowerCase().equals("p")){
                p++;
            }else if (arr[i].toLowerCase().equals("y")){
                y++;
            }
        }
        if(p == y){
            answer = true;
        }else{
            answer = false;
        }
        

        return answer;
    }
}
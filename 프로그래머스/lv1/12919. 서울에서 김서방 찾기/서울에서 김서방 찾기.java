import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int temp = 0;
        /*
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim"));
            temp = i;
        }
        */
        temp = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 " + temp + "에 있다";
        return answer;
    }
}
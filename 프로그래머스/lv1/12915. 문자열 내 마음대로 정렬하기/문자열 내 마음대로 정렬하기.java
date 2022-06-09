import java.util.*;

class Solution {
    public ArrayList <String> solution(String[] strings, int n) {
        ArrayList <String> answer = new ArrayList<>();
        
        Arrays.sort(strings);
        
        for(int i = 1; i < strings.length; i++){
            for(int j = 0; j < strings.length - i; j++){
                if((int)strings[j].charAt(n) > (int)strings[j+1].charAt(n)){
                    String temp1 = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp1;
                }
            }
        }
        for(int i = 0; i < strings.length; i++){
            answer.add(strings[i]);
        }
        return answer; 
    }
}

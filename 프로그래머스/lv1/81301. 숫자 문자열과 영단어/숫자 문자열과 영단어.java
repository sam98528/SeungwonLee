import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        String [] numbers = {"zero", "one", "two", "three","four",
                                "five","six","seven","eight","nine"};
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else{
                for(int j = 0; j < numbers.length; j++){
                    if(i+numbers[j].length() > s.length()){
                        continue;
                    }else{
                        String temp = s.substring(i, i+numbers[j].length());   
                        if(temp.compareTo(numbers[j]) == 0){
                            sb.append(j);
                            i = i+numbers[j].length()-1;
                            break;
                        }
                    }
                }
            }
        }
        
        String test = sb.toString();
        answer = Integer.parseInt(test);
        return answer;
    }
}
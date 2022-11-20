import java.util.*;


class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(new_id.toLowerCase());
        
        for(int i = 0; i < sb.length(); i++){
            
            if((!Character.isLetter(sb.charAt(i)) && !Character.isDigit(sb.charAt(i)))
                && !checkChar(sb.charAt(i))){
                sb.deleteCharAt(i);
                i--;
            }
        }
        
         for(int i = 0; i < sb.length(); i++){
            char temp = sb.charAt(i);
            int t;
             if(temp == '.'){
                 t = i;
                 while(true){
                     if(t + 1 < sb.length() && sb.charAt(t+1) == '.'){
                         t++;
                     }else{
                         break;
                     }
                 }
                 if(t != i){
                     sb.delete(i,t);
                    // i = t;
                 }
             }
        }
        
        if(sb.length() > 0 && sb.charAt(0) =='.'){
            sb.deleteCharAt(0);
        }
         if(sb.length() > 0 && sb.charAt(sb.length() -1 ) =='.'){
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length() == 0){
            sb.append('a');
        }
        if(sb.length() >= 16){
            sb.delete(15, sb.length());
        }
        if(sb.charAt(sb.length() -1 ) =='.'){
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length() < 3){
            while(sb.length() < 3){
                sb.append(sb.charAt(sb.length()-1));
            }
            
        }
        answer = sb.toString();
        return answer;
    }
    
    public boolean checkChar(char a){
        if (a == '.'|| a == '-' || a == '_'){
            return true;
        }
        else {
            return false;
        }
    }
}
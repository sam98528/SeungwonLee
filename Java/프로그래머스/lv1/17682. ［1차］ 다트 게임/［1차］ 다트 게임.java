import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int [] tempArr = new int[3];
        int a = 0;
        int j = 0;
        
        
        for(int i = 0; i < dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                if(Character.isDigit(dartResult.charAt(i+1))){
                    a = 10;
                    i++;
                }else{
                    a = (int)dartResult.charAt(i) - '0';
                }
            }else if(dartResult.charAt(i) == 'S'){
                tempArr[j] += a;
                if( i != dartResult.length() -1 && j != 2 && dartResult.charAt(i+1) != '*' && dartResult.charAt(i+1) != '#'){
                    j++;
                }
            }
            else if (dartResult.charAt(i) == 'D'){
                a *= a;
                tempArr[j] += a ;
                if( i != dartResult.length() -1 && j != 2 && dartResult.charAt(i+1) != '*' && dartResult.charAt(i+1) != '#'){
                    j++;
                }
            }else if (dartResult.charAt(i) == 'T'){
                a = a * a * a;
                tempArr[j] += a;
                if( i != dartResult.length() -1 && j != 2 && dartResult.charAt(i+1) != '*' && dartResult.charAt(i+1) != '#'){
                    j++;
                }
            }else if (dartResult.charAt(i) == '*'){
                if(j != 0){
                    for(int t = j - 1; t <= j; t++){
                        tempArr[t] *= 2;
                        System.out.println("TEST : " + t);
                    }
                    
                }else{
                    tempArr[0] *= 2;
                }
                j++;
            }else if (dartResult.charAt(i) == '#'){
                    tempArr[j] *= -1;
                    j++;
            }
            
        }
        

        for(int i = 0; i < 3; i++){
            System.out.println(tempArr[i]);
            answer += tempArr[i];
        }
        return answer;
    }
}
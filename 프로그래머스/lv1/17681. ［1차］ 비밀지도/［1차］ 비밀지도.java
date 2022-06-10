import java.util.*;


class Solution {
    public ArrayList <String> solution(int n, int[] arr1, int[] arr2) {
        
        ArrayList <String> answer = new ArrayList<>();
        int [] temp = new int[n];
        int num = (int)Math.pow(2,n); 
            
        for(int i = 0; i < n; i++){
            temp[i] = (arr1[i] | arr2[i]) | num;
        }
        
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            
            String str = Integer.toBinaryString(temp[i]).substring(1);
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '0'){
                    sb.append(' ');
                }else{
                    sb.append('#');
                }
            }
            answer.add(sb.toString());
        }
        
        System.out.println(Integer.toBinaryString(temp[0]));
        return answer;
    }
    
}
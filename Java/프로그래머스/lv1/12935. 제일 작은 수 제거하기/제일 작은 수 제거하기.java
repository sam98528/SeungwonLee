import java.util.*;
    
class Solution {
    public ArrayList <Integer> solution(int[] arr) {
        ArrayList <Integer> answer = new ArrayList<>();
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer.add(arr[i]);
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public Object [] solution(int[] numbers) {
        
        
        Set <Integer> arr = new LinkedHashSet <>();
        ArrayList <Integer> arr1 = new ArrayList<>();
        
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i+1; j < numbers.length; j++){
                arr.add(numbers[i]+numbers[j]);
            }
        }
        arr1.addAll(arr);
        Collections.sort(arr1);
        
        Object [] answer = arr1.toArray();
        return answer;
    }
}
import java.util.*;


class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int temp;
        int num = 0;
        int temp2 = 0;
        
        ArrayList <Integer> arr = new ArrayList<>();
        
        for(int i : citations){
            arr.add(i);
        }
        
        
        Collections.sort(arr, Collections.reverseOrder());
        Iterator <Integer> first = arr.iterator();
        temp = first.next();
        
        
         for(int i = 1; i <= temp; i++){
            Iterator <Integer> second = arr.iterator();
             num = 0;
             while(second.hasNext()){
                 if(second.next() >= i){
                     num++;
                 }
             }
             if(i > answer && arr.size() - num < num && num >= i){
                 answer = i;
             }
         }
        
        return answer;
    }
}
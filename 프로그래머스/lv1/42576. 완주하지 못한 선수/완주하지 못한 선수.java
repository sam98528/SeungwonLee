import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String ans = "";
        HashMap<String, Integer> hMap = new HashMap<>();
        
        for(String player : participant){
            hMap.put(player,hMap.getOrDefault(player, 0) +1);
        }
        for(String player : completion){
            hMap.put(player,hMap.get(player) - 1);
        }
        
        Iterator<Map.Entry<String, Integer>> entries = hMap.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            if(entry.getValue() != 0){
                ans = entry.getKey();
            }
        }
        
        return ans;
    }
    
}
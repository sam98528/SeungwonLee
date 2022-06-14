import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap <String, String> userId = new HashMap <>();
        ArrayList <String> ans = new ArrayList<>();
        ArrayList <String> ans1 = new ArrayList<>();
        
        for(String temp : record){
            String [] arr = temp.split(" ");
            if(arr[0].charAt(0) == 'E'){
                userId.put(arr[1], arr[2]);
                ans.add(arr[1]);
                ans1.add("IN");
            }else if(arr[0].charAt(0) == 'C'){
                userId.put(arr[1], arr[2]);
            }else{
                ans.add(arr[1]);
                ans1.add("OUT");
            }
        }
        
        String[] answer = new String [ans.size()];
        
        for(int i = 0; i < ans.size(); i++){
            String temp = userId.get(ans.get(i));
            if(ans1.get(i) == "IN"){
                answer[i] = temp +"님이 들어왔습니다.";
            }else{
                answer[i] = temp +"님이 나갔습니다.";
            }
            
        }
        
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap <String, String> userId = new HashMap <>(); // 유저 ID 와 바뀐 닉네임을 저장하는 hashmap
        ArrayList <String> ans = new ArrayList<>(); // "누가 (USERID)" 가 들어왔고 나갔는지 확인하기 위한 arrylist
        ArrayList <String> ans1 = new ArrayList<>(); // ans에 있는 USERID가 들어온것인지 나간것인지 확인하기 위한 ArrayList
        
        for(String temp : record){
            String [] arr = temp.split(" "); //각 record를 split를 이용해서 분리
            if(arr[0].charAt(0) == 'E'){ // ENTER 인 경우
                userId.put(arr[1], arr[2]); // 처음 들어온 경우 USERID 및 현재 닉네임 저장
                ans.add(arr[1]); // 입장 했으니깐 USERID 순서대로 저장
                ans1.add("IN"); // 입장했으니깐 IN
            }else if(arr[0].charAt(0) == 'C'){ //닉네임 변경하는 경우
                userId.put(arr[1], arr[2]); // HashMap 특성상 만약 기존에 key값이 존재하면 value만 변경, 없으면 추가 
            }else{ // 나가는 경우 
                ans.add(arr[1]); //USERID저장
                ans1.add("OUT"); // 나가는거니깐 OUT
            }
        }
        
        String[] answer = new String [ans.size()]; // 출력문 저장용 Array
        
        for(int i = 0; i < ans.size(); i++){ // 이제 ENTER & LEAVE 확인하면서 출력문 저장용 Array에 추가
            String temp = userId.get(ans.get(i)); // 우선 USERID로부터 현재 닉네임 구하고
            if(ans1.get(i) == "IN"){ //입장이면 들어왔습니다!
                answer[i] = temp +"님이 들어왔습니다.";
            }else{ // 나갔으면 나갔습니다!
                answer[i] = temp +"님이 나갔습니다.";
            }
            
        }
        
        
        return answer;
    }
}

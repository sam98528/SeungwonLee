import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int people = stages.length;
        int challenger = 0;

        int temp = 0;
        
        double rate = 0.0;
        
        Map <Integer,Double> hashMap = new HashMap<>();
        
        
        Arrays.sort(stages);
        
        for(int i = 1; i <= N; i++){
            temp = 0;
            challenger = 0;
            
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i){
                    temp++;
                    challenger++;
                }else if(stages[j] > i){
                    challenger++;
                }
            }
            if(challenger == 0){
                hashMap.put(i,0.0);
            }else{
                hashMap.put(i,(double)temp/(double)challenger);
            }
            
        }
        
        List <Integer> keyList = new ArrayList <>(hashMap.keySet());
        Collections.sort(keyList, (o1,o2)-> (hashMap.get(o2).compareTo(hashMap.get(o1))));
        
        int[] answer = new int[N];
        
        for(int i = 0 ; i < keyList.size(); i++){
            answer[i] = keyList.get(i);
        }
        
        //System.out.println(keyList);
        return answer;
    }
}
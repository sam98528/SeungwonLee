import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length;j++){
                if(lost[i] == reserve[j]){
                    lost[i] = reserve[j] = -10;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length;j++){
                if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1){
                    reserve[j] = lost[i] = -10;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            if(lost[i] > 0){
                answer++;
            }
        }
        answer = n - answer;
        
        return answer;
    }
}
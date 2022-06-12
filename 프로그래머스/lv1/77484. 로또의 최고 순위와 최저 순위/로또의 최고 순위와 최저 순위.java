import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int answer [] = {0,0};
        int zero = 0;
        int [] rank = {6,6,5,4,3,2,1};
        
        for(int i = 0;i < lottos.length; i++){
             if(lottos[i] == 0){
                        zero += 1;
                        continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    correct += 1;
                    break;
                }
            }
        }
        
        System.out.println(zero);
        System.out.println(correct);
        
        

            answer[0] = rank[correct + zero];
            answer[1] = rank[correct];
        
        
        return answer;
    }
}
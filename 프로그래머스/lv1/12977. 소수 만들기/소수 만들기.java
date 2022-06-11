import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                for(int k = j+1; k < nums.length; k++){
                    temp = nums[i]+nums[j]+nums[k];
                    if(check(temp)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean check(int num){
        boolean answer = true;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                answer = false;
            }
        }
        return answer;
    }
}
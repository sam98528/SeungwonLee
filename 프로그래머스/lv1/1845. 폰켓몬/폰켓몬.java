import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList <Integer> arr = new ArrayList <>();
        
        for(int i = 0; i < nums.length; i++){
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        
        int can = nums.length / 2;
        if(can >= arr.size()){
            answer = arr.size();
        }else{
            answer = can;
        }
        return answer;
    }
}
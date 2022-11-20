import java.util.*;


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int h = 0;
        int w = 0;
        
        
        for(int i = 0; i < sizes.length; i++){
           Arrays.sort(sizes[i]);
            
            if(sizes[i][0] > w){
                w = sizes[i][0];
            }
            if(sizes[i][1] > h){
                h = sizes[i][1];
            }
        }
        
        answer = w * h;
        return answer;
    }
}
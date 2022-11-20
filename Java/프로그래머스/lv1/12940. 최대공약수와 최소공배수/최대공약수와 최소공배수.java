class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        
        int min = 0;
        int max = 0;
        
        if( n > m){
            max = n;
            min = m;
        }else{
            max = m;
            min = n;
        }
    
        while (min != 0){
            int r = max % min;
            
            max = min;
            min = r;
        }
        
        
        answer[0] = max;
        answer[1] = (n * m) / max;
        
        return answer;
    }
}
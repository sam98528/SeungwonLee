class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int total = brown + yellow;
        int length = 0;
        int height = 0;
        int temp = 0;
        
        for(int i = 3; i * i <= total; i++){
            if(total % i == 0){
                length = i;
                height = total / i;
                temp = 2 * (length + height) - 4;
                if(temp == brown){
                    if(length > height){
                        answer[0] = length;
                        answer[1] = height;
                    }else{
                        answer[0] = height;
                        answer[1] = length;
                    }
                }
            }
            
        }
        return answer;
    }
}
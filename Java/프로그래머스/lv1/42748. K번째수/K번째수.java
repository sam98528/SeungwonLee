import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int [] tempArr = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            Arrays.sort(tempArr);
            int temp = commands[i][2] - 1; 
            answer[i] = tempArr[temp];
        }
        return answer;
    }
}
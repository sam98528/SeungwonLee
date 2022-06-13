import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        
        int [][] numPad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        
        int [] leftPos = {3,0};
        int [] rightPos = {3,2};
        
        int leftDist = 0;
        int rightDist = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int num : numbers){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    if(num == numPad[i][j]){
                        if(j == 0){
                            sb.append("L");
                            leftPos[0] = i;
                            leftPos[1] = j;
                        }
                        if(j == 2){
                            sb.append("R");
                            rightPos[0] = i;
                            rightPos[1] = j;
                        }
                        if(j == 1){
                            leftDist = Math.abs(i - leftPos[0]) + Math.abs(j - leftPos[1]);
                            rightDist = Math.abs(i - rightPos[0]) + Math.abs(j - rightPos[1]);
                            System.out.println("left: "+leftDist);
                            System.out.println("right: "+rightDist);
                            if(leftDist == rightDist){
                                if(hand.equals("right")){
                                    sb.append("R");
                                    rightPos[0] = i;
                                    rightPos[1] = j;
                                }else{
                                    sb.append("L");
                                    leftPos[0] = i;
                                    leftPos[1] = j;
                                }
                            }else{
                                if(leftDist > rightDist){
                                    sb.append("R");
                                    rightPos[0] = i;
                                    rightPos[1] = j;
                                }else{
                                    sb.append("L");
                                    leftPos[0] = i;
                                    leftPos[1] = j;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        String answer = sb.toString();
        return answer;
    }
}
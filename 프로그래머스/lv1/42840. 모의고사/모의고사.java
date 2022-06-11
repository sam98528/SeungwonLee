import java.util.*;

class Solution {
    public ArrayList <Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int [] first = {1,2,3,4,5};
        int [] second = {2,1,2,3,2,4,2,5};
        int [] third = {3,3,1,1,2,2,4,4,5,5};
        
        int [] rank = {0,0,0};
        
        int max = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i%5] ){
                rank[0]++;
            }
            if(answers[i] == second[i%8]){
                rank[1]++;
            }
            if(answers[i] == third[i%10]){
                rank[2]++;
            }
            
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println("1111:  "+ rank[i]);
            if(rank[i] > max){
                max = rank[i];
            }
        }
        
        for(int i = 0; i < 3; i++){
            if(rank[i] == max){
                answer.add(i+1);
            }
        }
        
        return answer;
    }
}
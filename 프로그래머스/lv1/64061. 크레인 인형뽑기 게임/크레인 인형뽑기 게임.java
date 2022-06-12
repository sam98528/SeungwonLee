import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Queue [] qBoard = new Queue[board.length];
        Queue basket = new Queue();
        int temp = 0;
        
        for(int i = 0; i < qBoard.length;i++){
            qBoard[i] = new Queue();
        }
        
        for(int i = board.length - 1; i >= 0; i--){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != 0){
                    qBoard[j].addElement(board[i][j]);
                            //System.out.println("j :" + j + " board[i][j] :" + board[i][j]);
                }
            }
            
        }
    

        for(int i = 0; i < moves.length; i++){
            temp = moves[i] - 1;
            if(!qBoard[temp].isEmpty()){
                //System.out.println(qBoard[temp].delElement());
                basket.addElement(qBoard[temp].delElement());
                basket.checkElement();
                answer++;
            }
            
        }
        
       answer -= basket.getNum();
        return answer;
    }
}

class Queue{
    public ArrayList <Integer> arr;
    public int topPos;
    
    Queue(){
        arr = new ArrayList<Integer>();
        this.topPos = -1;
    }
    
    public void addElement(int i){
        this.arr.add(i);
        this.topPos ++;

    }
    
    public int delElement(){
        int temp = this.arr.get(this.topPos);
        //System.out.println("Temp " + temp + " Top :" + topPos);
        this.arr.remove(this.topPos);
        this.topPos --;
        return temp;
    }
    
    public boolean isEmpty(){
        if(this.topPos == -1){
            return true;
        }else{
            return false;
        }
    }
    
    public void checkElement(){
        int temp;
        if(this.topPos > 0 && arr.get(this.topPos) == arr.get(this.topPos-1)){
            temp = delElement();
            temp = delElement();
        }
    }
    
    public int getNum(){
        return this.arr.size();
    }
    
}
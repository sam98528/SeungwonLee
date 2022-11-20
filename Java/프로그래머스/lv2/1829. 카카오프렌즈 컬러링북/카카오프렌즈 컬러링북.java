import java.util.*;


class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] visited;
    static int size = 0;
    
    public int[] solution(int m, int n, int[][] picture) {
        int max = 0;
        int numberOfArea = 0;
        int temp = picture[0][0];
        
        visited = new boolean[m][n];
        
        int[] answer = new int[2];
        
        
        
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(picture[i][j] > 0 && !visited[i][j]){
                    size = 1;
                    bfs(picture,i,j,m,n);
                    numberOfArea++;
                    if(max < size){
                        max = size;
                    }
                }
            }
        }
        answer[0] = numberOfArea;
        answer[1] = max;
        return answer;
    }
    public void bfs(int[][]board, int i, int j, int m, int n){
        Queue <Coordinates> queue = new LinkedList<Coordinates>();
        
        queue.add(new Coordinates(i,j));
        
        visited[i][j] = true;
        
        while(!queue.isEmpty()){
            Coordinates now = queue.poll();
            for(int k = 0; k < 4; k++){
                int x = now.x+dx[k];
                int y = now.y+dy[k];
                
                if(x < m && x >= 0 && y < n && y >= 0){
                    if(board[x][y] == board[i][j] && !visited[x][y]){
                        queue.add(new Coordinates(x,y));
                        visited[x][y] = true;
                        size++;
                    }
                }
            }   
        }
    }
}

class Coordinates{
    public int x;
    public int y;
    
    Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
}
import java.util.*;


class Solution {
    static HashSet <Integer> hs;
    public int solution(String numbers) {
        hs = new HashSet<>();
        String now = "";
        findAll(now,numbers);
        int answer = 0;
        boolean check;
        
        for(Iterator<Integer> itr = hs.iterator(); itr.hasNext();){
            check = false;
            int temp = itr.next();
            if(temp == 0 || temp == 1){
                continue;
            }
            for(int i = 2; i * i <= temp; i++){
                if(temp % i == 0){
                    check = true;
                }
            }
            if(check == false){
                answer++;
                System.out.println(temp);
            }
            //System.out.println(itr.next());
        }
        return answer;
    }
    
    
    
    public void findAll(String now, String left){
        if(now.length() != 0){
          hs.add(Integer.valueOf(now));  
        }
        for(int i = 0; i < left.length(); i++){
            findAll(now + left.charAt(i), left.substring(0,i) + left.substring(i+1));
        }
    }
}
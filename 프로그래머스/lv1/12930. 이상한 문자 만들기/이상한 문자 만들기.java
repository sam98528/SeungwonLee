class Solution {
    public String solution(String s) { 
        String [] temp = s.split("");
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 0; i < temp.length; i++){
                if(temp[i].charAt(0) == ' '){
                    j = 0;
                    sb.append(' ');
                    continue;
                }
                if(j % 2 == 0 ){
                    sb.append(Character.toUpperCase(temp[i].charAt(0)));
                    j++;
                }else{
                    sb.append(Character.toLowerCase(temp[i].charAt(0)));
                    j++;
                }
            }
        
        String answer = sb.toString();
        return answer;
    }
}
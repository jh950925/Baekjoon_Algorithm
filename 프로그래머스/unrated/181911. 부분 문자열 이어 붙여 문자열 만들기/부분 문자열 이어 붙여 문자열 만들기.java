import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuffer bf = new StringBuffer();
        
        for(int i=0; i<my_strings.length; i++){
            String str = my_strings[i];
            int a = parts[i][0];
            int b = parts[i][1];
            
            bf.append(str.substring(a,b+1));
        }
        
        answer = bf.toString();
        
        return answer;
    }
}
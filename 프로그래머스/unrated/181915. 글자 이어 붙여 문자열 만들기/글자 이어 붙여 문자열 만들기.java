import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char [] arrCh = new char[my_string.length()];
        StringBuffer bf = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            arrCh[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<index_list.length; i++){
            bf.append(arrCh[index_list[i]]);
        }
        
        
        return bf.toString();
    }
}
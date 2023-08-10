import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add(my_string.substring(0,s));
        arr.add(my_string.substring(s,e+1));
        
        arr.add(my_string.substring(e+1,my_string.length()));
        
        
        StringBuffer bf = new StringBuffer(arr.get(1));
        
        
        answer = arr.get(0) + bf.reverse().toString() + arr.get(2);
        
        return answer;
    }
}
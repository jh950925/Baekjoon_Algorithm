import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            arr.add(str);
        }
        
        if(arr.contains(is_suffix)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return  answer;
    }
}
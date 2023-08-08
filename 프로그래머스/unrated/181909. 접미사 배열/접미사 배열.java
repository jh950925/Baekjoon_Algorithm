import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arrStr = new ArrayList<>();
        
        //List에 모든 접미사 넣기
        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            arrStr.add(str);
        }
        
        Collections.sort(arrStr);
        
        String [] answer = new String[arrStr.size()];
        
        for(int i=0; i<arrStr.size(); i++){
            answer[i] = arrStr.get(i);
        }
        
        return answer;
    }
}
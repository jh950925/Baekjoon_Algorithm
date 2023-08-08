class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int idx = my_string.length();
        
        
        answer = my_string.substring(idx-n,idx);
        
        return answer;
    }
}
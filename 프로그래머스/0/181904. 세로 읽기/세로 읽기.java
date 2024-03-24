class Solution {
    public String solution(String str, int m, int c) {
        String answer = "";
        
        int n = str.length();
        for (int i=c-1; i<n; i+=m) {
            answer += str.charAt(i);
        }
        return answer;
    }
}
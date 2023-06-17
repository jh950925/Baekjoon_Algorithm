class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int str = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int n = 2 * a * b;

        if(str > n || str == n){
            answer = str;
        }else{
            answer = n;
        }
        
        return answer;
    }
}
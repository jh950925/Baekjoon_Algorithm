class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int re1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int re2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(re1 > re2){
            answer = re1;
        }else{
            answer = re2;
        }
        return answer;
    }
}
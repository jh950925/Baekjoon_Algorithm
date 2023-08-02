class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int num2 = 2 * a * b;
        
        int num1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        if(num1 > num2){
            answer = num1;
        }else if(num1 < num2){
            answer = num2;
        }else if(num1 == num2){
            answer = num1;
        }
        
        return answer;
    }
}
import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=start; i<=end; i++){
            arr.add(i);
        }
        
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
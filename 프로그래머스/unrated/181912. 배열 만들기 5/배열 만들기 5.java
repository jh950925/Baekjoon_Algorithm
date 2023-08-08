import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k) answer.add(num);
        }
        
        int[] arr = new int[answer.size()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = answer.get(i);
        }
        
        return arr;
    }
}
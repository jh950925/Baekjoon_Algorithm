import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0;i<queries.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                int k = queries[i][2];
                if(arr[j] > k) {
                    list.add(arr[j]);
                }
            }
            Collections.sort(list);
            if(list.isEmpty()){
                answer[i] = -1;
            }else{
                answer[i] = list.get(0);
            }
        }
        return answer;
    }
}
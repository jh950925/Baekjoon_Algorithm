class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++){
            int num = queries[i][2];
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(j%num==0){
                    arr[j] += 1;
                }
            }
        }
        answer = arr;
        return answer;
    }
}
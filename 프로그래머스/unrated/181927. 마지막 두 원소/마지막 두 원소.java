class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
              
        int a = num_list[num_list.length-1];
        int b = num_list[num_list.length-2];
        
        for(int i=0; i<answer.length; i++){
            if(i!=answer.length-1){
                answer[i] = num_list[i];
            }else{
                if(a<=b){
                    answer[i] = a*2;
                }else{
                    answer[i] = a-b;
                    
                }
            }
        }
        
        return answer;
    }
}
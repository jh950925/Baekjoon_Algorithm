import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        do{
          if(n%2==0){
              n /= 2;
          }else{
              n = 3*n+1;
          }
            arr.add(n);
        }while(n!=1);
        int[] answer = new int[arr.size()];
        
        for(int i=0;i< arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
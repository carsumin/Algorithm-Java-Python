import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int cnt = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
                
        if(cnt==0){
            int[] answer = {-1};
            return answer;
        }
                
        int[] answer = new int[cnt];
        int n = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[n] = arr[i];
                n++;
            }
        }        
        Arrays.sort(answer);

        return answer;
    }
}
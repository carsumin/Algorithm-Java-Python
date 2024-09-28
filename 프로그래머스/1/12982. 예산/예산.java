import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        //배열 오름차순 정렬
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            if(sum+d[i]<=budget){
                sum += d[i];
                answer++;
            }
        }
        return answer;
    }
}
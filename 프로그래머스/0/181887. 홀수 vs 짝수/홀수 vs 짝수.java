class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_odd = 0;
        int sum_eve = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                sum_eve += num_list[i];
            }else{
                sum_odd += num_list[i];
            }
        }
        
        answer = Math.max(sum_eve, sum_odd);
        
        return answer;
    }
}
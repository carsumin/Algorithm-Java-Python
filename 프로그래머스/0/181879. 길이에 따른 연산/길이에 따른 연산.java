class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int init = 1;
        int len = num_list.length;
        
        for(int i=0; i<len; i++){
            if(len >= 11){
                answer += num_list[i];
            }else{                
                init *= num_list[i];
            }
        }
        
        if(len<=10){
            answer += init;
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int eve = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){ //짝
                eve++;
            }else if(num_list[i]%2==1){ //홀
                odd++;
            }   
        }
        
        answer[0] = eve;
        answer[1] = odd;
        
        return answer;
    }
}
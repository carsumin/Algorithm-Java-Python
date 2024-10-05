class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        int cnt = 0;
        
        for(int i=0; i<c.length; i++){
            //공백
            if(c[i]==' '){
                cnt = 0;
                answer += c[i];
            }else{
                if(cnt%2==0){ //짝수                
                    answer += Character.toUpperCase(c[i]);
                }else if(cnt%2!=0){ //홀수
                    answer += Character.toLowerCase(c[i]);
                }
                cnt++;
            }
        }
        
        return answer;
    }
}
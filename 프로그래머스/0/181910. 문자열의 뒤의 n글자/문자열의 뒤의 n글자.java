class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] c = my_string.toCharArray();
        int len = c.length;
        
        for(int i=len-n; i<len; i++){
            answer += c[i];
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        
        for(int i=0; i<str1.length(); i++){
            answer += a[i];
            answer += b[i];
        }
        
        return answer;
    }
}
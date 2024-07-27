class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] s = control.toCharArray();
        
        for(int i=0; i<s.length; i++){
            if(s[i]=='w'){
                n += 1;
            }else if(s[i]=='s'){
                n -= 1;
            }else if(s[i]=='d'){
                n += 10;
            }else if(s[i]=='a'){
                n -= 10;
            }
        }
        
        answer = n;
        
        return answer;
    }
}
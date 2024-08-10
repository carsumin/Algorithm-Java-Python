class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        int cnt_p = 0;
        int cnt_y = 0;
        
        for(int i=0; i<c.length; i++){
            if(c[i]=='p' || c[i]=='P') {
                cnt_p++;
            }else if(c[i]=='y' || c[i]=='Y'){
                cnt_y++;
            }
        }
        if(cnt_p != cnt_y) answer = false;

        return answer;
    }
}
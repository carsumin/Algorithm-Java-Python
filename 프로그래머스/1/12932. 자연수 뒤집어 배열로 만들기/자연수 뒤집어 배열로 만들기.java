import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
        
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        
        String[] strArr = sb.toString().split("");       
        int[] answer = new int[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }       
        
        return answer;
    }
}
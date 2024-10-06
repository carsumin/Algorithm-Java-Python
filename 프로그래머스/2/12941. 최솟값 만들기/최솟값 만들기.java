import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int cnt = 1;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
            answer += A[i] * B[A.length-cnt];
            cnt++;
        }

        return answer;
    }
}
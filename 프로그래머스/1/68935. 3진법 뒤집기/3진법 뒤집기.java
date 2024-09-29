class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n!=0){
            str += n%3; //문자열에 앞뒤반전 결과값
            n = n/3;
        }
        //str을 3진수로 해석하여 10진수로 변환
        answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}
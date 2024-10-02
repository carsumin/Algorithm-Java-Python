class Solution {
    public String solution(String s) {
        String answer = "";
        //문자형 배열
        String[] sArr = s.split(" ");
        
        //max, min 초기값 설정
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);
        
        //sArr 순회
        for(String str:sArr){
            int tmp = Integer.parseInt(str);
            if(tmp > max) max = tmp;
            if(tmp < min) min = tmp;
        }
        
        answer += min + " " + max;
        return answer;
    }
}
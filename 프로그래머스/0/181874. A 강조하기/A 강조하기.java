class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] str = myString.toCharArray();
        
        for(int i=0; i<str.length; i++){
            if(str[i] == 'a'){
                str[i] = 'A';
            }else if(str[i]!='A' && Character.isUpperCase(str[i])){
                str[i] = Character.toLowerCase(str[i]);
            }
            answer += str[i];
        }        
        return answer;
    }
}
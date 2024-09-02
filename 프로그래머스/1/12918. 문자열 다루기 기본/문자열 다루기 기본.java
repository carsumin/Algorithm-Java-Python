class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6){
            char[] c = s.toCharArray();
            
            for(int i=0; i<c.length; i++){
                if(!Character.isDigit(c[i])) answer = false;
            }
        }else{
            answer = false;
        } 
        
        return answer;
    }
}
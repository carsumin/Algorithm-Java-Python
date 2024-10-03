import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty()){ //짝이 안맞는상태에서 )가 나오면 false 리턴함
                    return false;
                }
                stack.pop();
            }
        }
        //스택이 비어있으면 괄호짝이 맞음
        return stack.isEmpty(); 
    }
}
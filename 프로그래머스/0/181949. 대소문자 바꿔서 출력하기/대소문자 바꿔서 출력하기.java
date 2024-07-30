import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] s = a.toCharArray();
        
        for(int i=0; i<s.length; i++){
            if(!(Character.isUpperCase(s[i]))){
                s[i] = Character.toUpperCase(s[i]);
            }else{
                s[i] = Character.toLowerCase(s[i]);
            }
        }
        System.out.println(s);  
    }
}
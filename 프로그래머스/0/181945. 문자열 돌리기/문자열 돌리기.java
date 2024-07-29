import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] s = a.toCharArray();
        
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
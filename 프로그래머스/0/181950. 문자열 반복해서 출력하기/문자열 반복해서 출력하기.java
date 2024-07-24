import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            s += str;
        }
        
        System.out.println(s);
    }
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int len = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<len; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        
        if(n==sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
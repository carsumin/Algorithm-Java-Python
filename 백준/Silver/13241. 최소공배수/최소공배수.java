import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        
        System.out.println(a*b/gcd(a,b));
    }
    
    public static long gcd(long a, long b){
        while(b!=0){
           long r = a%b;
            a = b;
            b = r; 
        }
        return a;
    }
}
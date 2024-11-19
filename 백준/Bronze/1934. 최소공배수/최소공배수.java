import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            //최소공배수 = a*b/최대공약수
            System.out.println(a*b/gcd(a,b));
        }
    }
    
    //최대공약수 구하기
    public static int gcd(int a, int b){        
        while(b!=0){ //대소비교없음
            int r = a%b;
            
            //재귀
            a = b;
            b = r;
        }
        return a;
    }
}
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int c = Integer.parseInt(str.split(" ")[2]);
        int sum = 0;
        
        if(a==b && a==c){ //3개의 눈이 같은 경우
            sum = 10000+a*1000;
        }else if(a==b || a==c){ //2개의 눈이 같은 경우
            sum = 1000+a*100;
        }else if(b==c){ //2개의 눈이 같은 경우
            sum = 1000+b*100;
        }else{ //모두 다른 경우
            int max = Math.max(a, Math.max(b,c));
            sum = max*100;
        };
        
        bw.write(String.valueOf(sum));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
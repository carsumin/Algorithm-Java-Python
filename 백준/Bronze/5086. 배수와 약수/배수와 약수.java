import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            //0,0 입력시 반복문 종료
            if(a==0 && b==0) break;
            
            //a,b 크기 비교
            if(a>b){
                if((a%b)==0) System.out.println("multiple");
                else System.out.println("neither");
            }else if(a<b){
                if((b%a)==0) System.out.println("factor");
                else System.out.println("neither");
            }
        }
    }
}
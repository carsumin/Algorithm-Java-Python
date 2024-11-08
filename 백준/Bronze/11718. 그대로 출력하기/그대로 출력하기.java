import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        
        //입력이 없을때까지 출력
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        
        br.close();
    }
}
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            String[] str = br.readLine().split(" "); //공백으로 분리 (정수, 문자열 한번에 입력받음)
            int r = Integer.parseInt(str[0]); //첫번째 : 정수
            String s = str[1]; //두번째 : 문자열
            
            for(int j=0; j<s.length(); j++){
                for(int k=0; k<r; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
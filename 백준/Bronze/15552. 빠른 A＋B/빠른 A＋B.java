import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            bw.write((a+b) + "\n");
        } 
        br.close();
        bw.flush();
        bw.close();
    }
}
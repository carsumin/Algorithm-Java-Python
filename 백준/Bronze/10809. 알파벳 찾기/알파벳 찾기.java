import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //알파벳 원소 총 26개
        int[] arr = new int[26];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        
        String str = br.readLine();
        
        for(int i=0; i<str.length(); i++){
            //문자열 원소 추출
            char c = str.charAt(i);
            
            //문자열이 처음 나타난 위치
            if(arr[c-'a'] == -1){ 
                arr[c-'a'] = i;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        br.close();
    }
}
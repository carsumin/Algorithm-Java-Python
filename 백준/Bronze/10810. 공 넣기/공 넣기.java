import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //바구니를 N개 가지고 있음
        int n = sc.nextInt();
        int[] arr = new int[n];
        //M번 공을 넣음
        int m = sc.nextInt();
        
        for(int a=0; a<m; a++){
            //세 정수 i,j,k
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int b=i-1; b<j; b++){ //i부터j까지 k번 번호 넣음
                arr[b] = k;
            }
        }
        
        for(int c=0; c<arr.length; c++){
            System.out.print(arr[c]+" ");
        }
    }
}
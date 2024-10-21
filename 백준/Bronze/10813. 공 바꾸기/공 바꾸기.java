import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //가지고 있는 바구니 개수
        int N = sc.nextInt();
        int[] arr = new int[N];
        //바꿀 횟수
        int M = sc.nextInt();
        
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        
        for(int j=0; j<M; j++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int temp = 0;
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
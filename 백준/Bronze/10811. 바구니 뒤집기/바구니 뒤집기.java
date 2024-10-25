import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0; i<arr.length; i++){     
            arr[i] = i+1;
        }
         
        for(int i=0; i<M; i++){
            int I = sc.nextInt()-1;
            int J = sc.nextInt()-1;
            while(I<J){
                int tmp = 0;
                tmp = arr[I];
                arr[I] = arr[J];
                arr[J] = tmp;
                I++;
                J--;
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
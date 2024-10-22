import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //출석번호 1~30
        int[] arr = new int[31];
        int n = 0;
        
        for(int i=1; i<29; i++){
            n = sc.nextInt();
            arr[n] = 1; 
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=1) System.out.println(i);
        }
        
        sc.close();
    }
}
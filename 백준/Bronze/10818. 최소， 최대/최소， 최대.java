import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1000000;
        int min = 1000000;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println(min + " " + max);
    }
}
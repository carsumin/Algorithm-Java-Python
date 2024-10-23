import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int diff = 0;
        
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt() % 42;
        }
        
        for(int i=0; i<10; i++){
            int cnt = 0;
            for(int j=i+1; j<10; j++){
                if(arr[i]==arr[j]) cnt++; //값이 같으면 cnt증가
            }           
            if(cnt==0) diff++; //값이 다른 경우 diff증가
        }
        sc.close();
        System.out.println(diff);
    }
}
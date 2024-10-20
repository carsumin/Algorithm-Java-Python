import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //double형 배열
        double[] arr = new double[sc.nextInt()];
        double max = 0;
        double sum = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
            if(arr[i]>max) max = arr[i]; 
        }
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i]/max*100;
        }
        
        System.out.println(sum/arr.length);

    }
}
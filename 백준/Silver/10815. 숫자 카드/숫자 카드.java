import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //상근이가 가진 카드
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //이진탐색을 위한 정렬
        Arrays.sort(arr);
        
        //비교할 카드
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<M; i++){
            int result = binarySearch(Integer.parseInt(st.nextToken()));
            if(result != -1) System.out.print(1 + " ");
            else System.out.print(0 + " ");
                                      
        }
    }
    
    //이진탐색
    private static int binarySearch(int target){
        int left = 0;
        int right = arr.length-1;
        int mid;
        
        while(left <= right){
            mid = (left+right)/2;
            if(arr[mid] < target) left = mid+1;
            else if(arr[mid] > target) right = mid-1;
            else return mid;
        }
        return -1;
    }
}
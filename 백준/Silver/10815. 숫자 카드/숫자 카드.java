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
        
        //StringBuilder로 출력
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<M; i++){
            int result = binarySearch(Integer.parseInt(st.nextToken()));
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    
    //이진탐색
    private static int binarySearch(int target){
        int left = 0;
        int right = arr.length-1;
        int mid;
        
        while(left <= right){
            mid = (left+right)/2;
            if(arr[mid] == target) return 1; //값이 있음
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return 0; //값이 없음
    }
}
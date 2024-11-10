import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] answer = new int[n][m];
        
        //첫번째 행렬 입력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        //두번째 행렬 입력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(answer[i][j]+" ");
                if(j==m-1){
                    System.out.println();
                }
            }
        }
    }
}
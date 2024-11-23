import java.io.*;
import java.util.*;

public class Main{
    static boolean[] visited;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            //순열크기 입력
            int N = Integer.parseInt(br.readLine());
            arr = new int[N+1];
            
            //노드 방문 기록할 배열
            visited = new boolean[N+1];
            
            //순열 입력
            String[] str = br.readLine().split(" ");           
            for(int j=1; j<=N; j++){
                arr[j] = Integer.parseInt(str[j-1]);
            } 
            
            int cycle = 0;
            
            //탐색
            for(int n=1; n<=N; n++){
                if(!visited[n]){ //방문하지 않은 노드에서 시작
                    dfs(n);
                    cycle++;
                }                
            }
            
            System.out.println(cycle);
        }
    }
    
    //DFS
    static void dfs(int node){
        //현재 노드 방문
        visited[node] = true;
        int nextNode = arr[node];
        if(!visited[nextNode]){ //다음 노드 방문안했으면 탐색
            dfs(nextNode);
        }
    }
}
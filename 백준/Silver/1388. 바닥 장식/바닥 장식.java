import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static char[][] graph;
    static int cnt;
    static int N,M;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        
        visited = new boolean[N+1][M+1];
        graph = new char[N+1][M+1];
        
        for(int i=1; i<N+1; i++){
            char[] c = br.readLine().toCharArray();
            for(int j=1; j<M+1; j++){
                graph[i][j] = c[j-1];
            }
        }
        
        //방문탐색
        for(int i=1; i<N+1; i++){
            for(int j=1; j<M+1; j++){
                if(!visited[i][j]){
                    dfs(i, j);
                }
            }
        }
        
        //출력
        System.out.println(cnt);
   
    }
    
    //DFS 탐색
    private static void dfs(int i, int j){
        visited[i][j] = true;
        
        if(graph[i][j]=='-'){ //->
            if(j==M){ //행의 끝이면
                cnt++;
                return;
            }
            int nextY = j+1;
            if(!visited[i][nextY] && graph[i][nextY] == '-'){ //방문한적 없고 '-'이면
                dfs(i, nextY); //재귀호출
            }else{
                cnt++;
                return;
            }
        }
        
        if(graph[i][j] == '|'){ //↓
            if(i==N){ //열의 끝이면
                cnt++;
                return;
            }
            
            int nextI = i+1;
            if(!visited[nextI][j] && graph[nextI][j] == '|'){ //방문한적 없으면서 '|'이면
                dfs(nextI, j); //재귀호출
            }else{
                cnt++;
                return;
            }
        }
    }
}
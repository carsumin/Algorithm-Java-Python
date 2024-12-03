import java.io.*;
import java.util.*;

public class Main{
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        //정점, 간선, 시작점
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int R = Integer.parseInt(str[2]);
        
        visited = new int[N+1];
        
        //graph 초기화
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<>());
        }
        
        //graph에 값 저장
        for(int i=0; i<M; i++){
            str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        for(int i=1; i<N+1; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        
        count = 1;
        
        //시작정점부터
        dfs(R);
        
        //출력
        for(int i=1; i<=N; i++){
            System.out.println(visited[i]);
        }
    }
    
    private static void dfs(int node){
        visited[node] = count;
        
        for(int i=0; i<graph.get(node).size(); i++){
            int nextNode = graph.get(node).get(i);
            if(visited[nextNode] == 0){
                count++;
                dfs(nextNode);
            }
        }
    }
}
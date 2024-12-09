import java.io.*;
import java.util.*;

public class Main{
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static ArrayList<Integer> dfsList = new ArrayList<>();
    static ArrayList<Integer> bfsList = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);
        
        //graph 초기화
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        
        //graph에 간선 입력
        for(int i=0; i<M; i++){
            str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            
            //양방향
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        //오름차순 방문
        for(int i=1; i<=N; i++){
            Collections.sort(graph.get(i));
        }
        
        //DFS
        visited = new boolean[N+1];
        dfs(V);
        
        //BFS
        visited = new boolean[N+1];
        bfs(V);
        
        //출력
        for(int node : dfsList){
            System.out.print(node + " ");
        }
        System.out.println();
        for(int node : bfsList){
            System.out.print(node + " ");
        }
        
    }
    
    //DFS 탐색
    private static void dfs(int node){
        visited[node] = true;
        dfsList.add(node);
        
        for(int nextNode : graph.get(node)){
            if(!visited[nextNode]){
                dfs(nextNode);
            }
        }
    }
    
    //BFS 탐색
    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            bfsList.add(current);
            
            for(int nextNode : graph.get(current)){
                if(!visited[nextNode]){
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
    }
}
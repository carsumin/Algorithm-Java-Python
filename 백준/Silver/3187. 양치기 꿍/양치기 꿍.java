import java.io.*;
import java.util.*;

public class Main{
    static int R, C;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int wolf = 0;
    static int sheep = 0;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        R = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        
        map = new char[R][C];
        visited = new boolean[R][C];
        
        for(int i=0; i<R; i++){
            String s = br.readLine();
            for(int j=0; j<C; j++){
                map[i][j] = s.charAt(j);
            }
        }
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(!visited[i][j] && map[i][j] != '#'){
                    //BFS 탐색
                    int[] result = bfs(i,j);
                    int sheepTotal = result[0];
                    int wolfTotal = result[1];
                    
                    if(sheepTotal > wolfTotal){
                        sheep += sheepTotal;
                    }else{
                        wolf += wolfTotal;
                    }
                }
            }
        }
        //출력
        System.out.println(sheep + " " + wolf);
    }
    
    private static int[] bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        
        int sheepCnt = 0;
        int wolfCnt = 0;
        
        //시작이 양인지 늑대인지 체크
        if(map[x][y] == 'k') sheepCnt++;
        if(map[x][y] == 'v') wolfCnt++;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            
            for(int i=0; i<4; i++){
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];
                
                if(nx>=0 && nx<R && ny>=0 && ny<C && !visited[nx][ny] && map[nx][ny] != '#'){
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                    
                    //카운트
                    if(map[nx][ny] == 'k') sheepCnt++;
                    if(map[nx][ny] == 'v') wolfCnt++;
                }
            }
        }
        
        return new int[]{sheepCnt, wolfCnt};
    }
}
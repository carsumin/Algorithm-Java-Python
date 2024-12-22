import java.io.*;
import java.util.*;

public class Main{
    static int R, C; //행, 열
    static boolean[][] visited;
    static char[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int sheep = 0;
    static int wolf = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        
        C = Integer.parseInt(str[0]);
        R = Integer.parseInt(str[1]);
        
        map = new char[C][R];
        visited = new boolean[C][R];
        
        //map초기화
        for(int i=0; i<C; i++){
            String s = br.readLine();
            for(int j=0; j<R; j++){
                map[i][j] = s.charAt(j);
            }
        }
        
        for(int i=0; i<C; i++){
            for(int j=0; j<R; j++){
                if(!visited[i][j] && map[i][j] != '#'){
                    bfs(i, j);
                }
            }
        }
        
        //출력
        System.out.println(sheep + " " + wolf);
    }
    
    private static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        
        int sheepCnt = 0;
        int wolfCnt = 0;
        
        if(map[x][y] == 'o') sheepCnt++;
        if(map[x][y] == 'v') wolfCnt++;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            
            for(int i=0; i<4; i++){
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];
                
                if(nx >= 0 && nx < C && ny >= 0 && ny < R && !visited[nx][ny] && map[nx][ny] != '#'){
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                    
                    if(map[nx][ny]=='o') sheepCnt++;
                    if(map[nx][ny]=='v') wolfCnt++;
                }
            }
        }
        if(sheepCnt > wolfCnt){
            sheep += sheepCnt;
        }else{
            wolf += wolfCnt;
        }
    }
}
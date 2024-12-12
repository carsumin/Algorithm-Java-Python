import java.io.*;
import java.util.*;

public class Main{
    static int[][] grid = new int[5][5];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static Set<String> set = new HashSet<>();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //grid 초기화
        for(int i=0; i<5; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<5; j++){
                grid[i][j] = Integer.parseInt(str[j]);
            }
        }
        
        //DFS 탐색 모든 정점에서
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, "", 0); //정점위치 i,j , 문자열, 이동횟수
            }
        }
        
        //출력
        System.out.println(set.size());
    }
    
    private static void dfs(int x, int y, String path, int depth){
        
        if(depth == 6){ //6자리
            set.add(path);
            return;
        }
        
        //현재 위치의 숫자를 문자열에 추가
        path += grid[x][y];
        
        //네 방향으로 이동 (위, 아래, 오른, 왼)
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            //grid내에 위치하는지 체크 -> 계속 dfs탐색
            if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5){
                dfs(nx, ny, path, depth+1);
            }
        }
    }
}
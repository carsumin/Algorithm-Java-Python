import java.io.*;
import java.util.*;

public class Main{
    static int[][] map; //지도
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int N; //지도 크기
    static int cnt; //집의 수
    static ArrayList<Integer> list = new ArrayList<>(); //집의 수 결과 저장
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        //map 크기
        map = new int[N][N];
        
        //map 초기화
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        //DFS 탐색
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(map[x][y]==1){
                    cnt=0;
                    dfs(x,y);
                    list.add(cnt);
                }
            }
        }
        
        //출력
        System.out.println(list.size());
        
        Collections.sort(list);
        for(Integer n : list){
            System.out.println(n);
        }
    }
    
    //DFS 탐색
    private static void dfs(int x, int y){
        map[x][y]=0; //집이 없으면
        cnt++;
        
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<N && ny>=0 && ny<N){
                if(map[nx][ny]==1){ //집이 있으면 탐색 계속
                    dfs(nx, ny);                        
                }
            }
        }
    }
}
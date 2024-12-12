import java.io.*;
import java.util.*;

public class Main{
    static int[][] grid;
    static ArrayList<Integer> list = new ArrayList<>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N,M;
    static int cnt;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        M = Integer.parseInt(str[0]); //M:높이
        N = Integer.parseInt(str[1]); //N:너비
        int K = Integer.parseInt(str[2]); //K:직사각형 개수
        
        //grid 초기화
        grid = new int[N][M];
        
        //좌표입력
        for(int i=0; i<K; i++){
            str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);
            
            for(int x=x1; x<x2; x++){
                for(int y=y1; y<y2; y++){
                    grid[x][y] = 1; //영역 1로 채우기
                }
            }
        }
        
        //DFS 탐색 (0,0)부터
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(grid[i][j]==0){
                    cnt = 0;
                    dfs(i, j);
                    list.add(cnt); //DFS탐색 끝난 뒤 count값 list에 결과저장
                }
            }
        }
        
        //출력 : 분리된 영역 개수
        System.out.println(list.size());
        
        //출력 : 각 영역 넓이 오름차순
        Collections.sort(list);
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
    
    //DFS
    private static void dfs(int x, int y){
        //영역이 채워져 있으면 cnt 증가
        grid[x][y] = 1;
        cnt++;
        
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            
            if(nx>=0 && nx<N && ny>=0 && ny<M){
                if(grid[nx][ny]==0){ //빈영역이면 탐색 계속
                    dfs(nx, ny);
                }
            }
        }
    }
}
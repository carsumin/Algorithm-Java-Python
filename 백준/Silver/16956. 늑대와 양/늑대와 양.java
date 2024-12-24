import java.io.*;
import java.util.*;

public class Main{
    static int R, C;
    static char[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        R = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        
        map = new char[R][C];
        
        //map초기화
        for(int i=0; i<R; i++){
            String s = br.readLine();
            for(int j=0; j<C; j++){
                map[i][j] = s.charAt(j);
            }
        }
        
        //울타리 설치 여부 체크
        if(!canFence()){
            System.out.println(0);
        }else{
            System.out.println(1);
            //출력
            for(int i=0; i<R; i++){
                for(int j=0; j<C; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }
    
    private static boolean canFence(){
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j] == 'S'){ //양이 있을 경우
                    for(int k=0; k<4; k++){
                        int nx = dx[k] + i;
                        int ny = dy[k] + j;
                        
                        if(nx >= 0 && nx < R && ny >= 0 && ny < C){
                            if(map[nx][ny] == 'W'){ //늑대-양 인접할 경우 울타리 x
                                return false;
                            }else if(map[nx][ny] == '.'){ //빈곳에 울타리 설치
                                map[nx][ny] = 'D';
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
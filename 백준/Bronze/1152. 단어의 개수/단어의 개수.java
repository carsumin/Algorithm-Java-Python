import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(str," ");
        
        //토큰 개수 반환
        System.out.println(st.countTokens());
    }
}
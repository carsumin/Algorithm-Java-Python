import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){ //읽을것이 없을 경우 반복문 종료
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        //입력 닫기
        sc.close();
    }
}
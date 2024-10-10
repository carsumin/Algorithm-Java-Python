import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        
        int allTime = hour*60 + min + time;
        hour = (allTime / 60) % 24;
        min = allTime % 60;
        
        System.out.println(hour+" "+min);
    }
}
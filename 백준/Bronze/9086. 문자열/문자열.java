import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        
        for(int i=0; i<n; i++){
            String s = sc.next();
            str[i] = s.substring(0,1)+s.substring(s.length()-1, s.length());
        }
        
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }
        
        sc.close();
    }
}
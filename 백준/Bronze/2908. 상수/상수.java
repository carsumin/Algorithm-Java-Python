import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuffer strA = new StringBuffer(a);
        String aa = strA.reverse().toString();
        StringBuffer strB = new StringBuffer(b);
        String bb = strB.reverse().toString();
        
        int aaa = Integer.parseInt(aa);
        int bbb = Integer.parseInt(bb);
        
        if(aaa>bbb){
            System.out.println(aaa);
        }else{
            System.out.println(bbb);
        }
        
    }
}
import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        int re=0;
        while(n != 0){
            r=n%10;
            re=re*10+r;
            n=n/10;
        }
        
        System.out.println(re);
    }
}
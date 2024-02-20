import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        int l=0;
        while (n>0){
            l=n%10;
            if(l > m){
                m=l;
            }
            n=n/10;
        }
        System.out.println(m);
    }
}
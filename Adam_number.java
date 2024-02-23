import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int dummy = a * a;
        int r=0;
        int re=0;
        while (a>0){
            r=a%10;
            re=re*10+r;
            a=a/10;
        }
        //System.out.println(re);
        
        int s=0;
        int g=re*re;
        int b=0;
        while(g>0){
            s=g%10;
            b=b*10+s;
            g=g/10;
        }
        
        // int m=0;
        // int c=0;
        // while(b>0){
        //     m=b%10;
        //     c=c*10+m;
        //     b=b/10;
        // }
        //   System.out.println(re*re);
        //   System.out.println(c);
        
        if(b == dummy){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
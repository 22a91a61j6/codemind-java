import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int c=0;
        int m=0;
        for(int i=1;i<=a;i++){
            m=sc.nextInt();
            if(m%2 != 0){
                c=c+m;
            }
        }
        System.out.println(c);
    }
}
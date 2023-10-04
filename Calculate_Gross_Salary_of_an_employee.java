import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        float s=sc.nextFloat();
        float hr=sc.nextFloat();
        float da=sc.nextFloat();
        double pf=0.12*s;
        double gs=s+hr+da+pf;
        System.out.printf("%.2f",pf);
        System.out.println();
        System.out.printf("%.2f",gs);
    }
}
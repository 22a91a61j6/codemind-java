import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        float s=sc.nextFloat();
        float hr=sc.nextFloat();
        float da=sc.nextFloat();
        double n=0.12*s;
        double m=s+hr+da+n;
        System.out.printf("%.2f",n);
        System.out.println();
        System.out.printf("%.2f",m);
    }
}
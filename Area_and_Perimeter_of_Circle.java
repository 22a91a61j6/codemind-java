import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=3.14*n*n;
        double b=3.14*2*n;
        System.out.printf("%.2f",a);
        System.out.println();
        System.out.printf("%.2f",b);
    }
}
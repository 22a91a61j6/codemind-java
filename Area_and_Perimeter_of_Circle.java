import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=n*n*3.14;
        double p=2*3.14*n;
        System.out.printf("%.2f",a);
        System.out.println();
        System.out.printf("%.2f",p);
    }
}
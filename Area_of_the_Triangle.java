import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        double s=(a+b+c)/2;
        double f=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",f);
    }
}
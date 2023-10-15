import java.util.*;
public class Teee{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int b=sc.nextInt();
        double d;
        double h;
        double t;
        if(b<=10000){
            d=b*0.8;
            h=b*0.2;
            t=b+d+h;
            System.out.printf("%.2f",t);
        }else if(b>10000 && b<=20000){
            d=b*0.9;
            h=b*0.25;
            t=b+d+h;
            System.out.printf("%.2f",t);
        }if(b>20000){
            d=b*0.95;
            h=b*0.3;
            t=b+d+h;
            System.out.printf("%.2f",t);
        }
    }
}
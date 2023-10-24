import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // double n;
        // double g;
        if(a==b && b==c){
            // n=c*1.20;
            // g=n+100;
            System.out.println("Equilateral triangle");
        }else if(a==b || a==c || b==c){
            // n=c*1.50;
            // g=n+100;
            System.out.println("Isosceles triangle");
        }else {
            // n=(c*1.80);
            // g=n*0.15;
            System.out.println("Scalene triangle");
        }
        //else{ //if(c>=600){
        //     n=(c*2.00);
        //     g=n*0.15;
        //     System.out.printf("%.2f",g);
        // }
    }
}
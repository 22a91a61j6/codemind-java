import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a+b)*0.5;
        System.out.printf("Average of " +a+ " and "+b+" is: "+"%.2f",c);
    }
}
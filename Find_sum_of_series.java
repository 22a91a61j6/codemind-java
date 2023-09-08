 import java.util.*;
public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            //;
            sum=sum+(1/i);
            }
            System.out.printf("%.2f",sum);
        }
    }

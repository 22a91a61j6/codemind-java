import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        double c=Math.sqrt((n-n3)*(n-n3)+(n2-n4)*(n2-n4));
        System.out.printf("%.4f",c);
    }
}
import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int p=s/365;
        int c=(s%365)/7;
        System.out.println(p);
        System.out.println(c);
    }
}
import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=n/365;
        int v=(n%365)/7;
        System.out.println(c);
        System.out.println(v);
    }
}
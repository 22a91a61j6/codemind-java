import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n/60;
        int b=n%60;
        System.out.println(c+ " Hour(s) "+ b +" Minute(s)");
    }
}
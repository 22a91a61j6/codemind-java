import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=(n/60)/60;
        int m=(n-(h*3600))/60;
        int c=(n-(h*3600))%60;
        System.out.println("H:M:S-"+h+":"+m+":"+c);
    }
}
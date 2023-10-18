import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        if(a>34 &&b>34 &&c>34 &&d>34 &&e>34){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
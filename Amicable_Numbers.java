import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int s=sc.nextInt();
        int a=0;
        int b=0;
        for(int i=1;i<=f;i++){
            if(f%i == 0){
                a=a+i;
            }
        }
        for(int i=1;i<=s;i++){
            if(s%i == 0){
                b=b+i;
            }
        }
        // }
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(f);
        // System.out.println(s);
        
         if(a==b){
             System.out.println("Amicable");
         }
         else{
            System.out.println("Not Amicable");
        }
    }
}
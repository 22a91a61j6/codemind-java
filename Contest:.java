import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a <= (b*1)+(c*2))
        {
            System.out.println("Qualify");
        }else{
            System.out.println("Not Qualify");
        }
    }
}
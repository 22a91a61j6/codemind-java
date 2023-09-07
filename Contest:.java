import java.util.*;
public class Me{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*1;
        int d=b*2;
        if((c+d) >= n)
        {
            System.out.println("Qualify");
        }else{
            System.out.println("Not Qualify");
        }
    }
}
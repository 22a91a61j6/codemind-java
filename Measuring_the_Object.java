import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(e==b || e==c || e==d || e==d+c || e==b+c || e == b + d|| e==c+d || e==b+c+d)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
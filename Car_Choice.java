import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            double x1,x2,y1,y2;//x=distance , y=cost
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            if(x1/y1 > x2/y2)
            {
                System.out.println(-1);
            }
            else if(x1/y1 < x2/y2){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
            // if(x1>x2)
            // {
            //     if(y1<y2){
            //         System.out.println("-1");
            //     }else {
            //         System.out.println("1");
            //     }
            // }
            // else if(x1<x2)
            // {
            //     if(y1>y2){
            //         System.out.println("1");
            //     }else {
            //         System.out.println("-1");
            //     }
            // }else if(x1==x2)
            // {
            //     if(y1>y2){
            //         System.out.println("1");
            //     }else {
            //         System.out.println("-1");
            //     }
            // }
            // else{
            //     System.out.println("0");
            // }
       
import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int cost = 0;
        
        cost= k*x;
        if(x < y){
            cost = cost + (n - k) * x;
        }
        else{
            cost += (n - k) * y;
            
        }
        System.out.println(cost);
    }
}
import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            int g=n/4;
            System.out.println(g);
        }
        else{
            int g=n/4;
            System.out.println(g+1);
        }
    }
}
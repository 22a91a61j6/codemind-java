import java.util.*;
public class Test {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String d=sc.next();
            int f=Integer.parseInt(d,8);
            System.out.println(Integer.toString(f,2));
        }
    }
}
import java.util.*;
public class Tst{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y*30 <=x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
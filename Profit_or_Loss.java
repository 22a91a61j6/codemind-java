import java.util.*;
public class Tets{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            System.out.println("Profit");
        }else if(a==b){
            System.out.println("No Profit and No Loss");
        }else{
            System.out.println("Loss");
        }
    }
}
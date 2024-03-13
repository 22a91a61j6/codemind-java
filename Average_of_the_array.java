import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        double c=0;
        double b=0;
        int arr[]=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            c+=arr[i];
            
        }
        b=c/a;
        System.out.printf("%.2f",b);
    }
}
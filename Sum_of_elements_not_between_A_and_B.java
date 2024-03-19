import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int m=0;
        int d=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            m=m+arr[i];
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<a;i++){
            // d=d+arr[i];
            if(arr[i]>=b && arr[i]<=c){
                d+=arr[i];
            }
        }   
        System.out.println(m-d);
    }
}
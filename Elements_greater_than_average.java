import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int c=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            c=c+arr[i];
        }
        int m=c/a;
        int d=0;
        for(int i=0;i<a;i++){
            if(arr[i]>=m){
                d+=1;
            }
        }
        System.out.println(d);
    }
}
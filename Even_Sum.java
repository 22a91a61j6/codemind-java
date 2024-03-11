import java.util.*;
public class test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                c=c+arr[i];
            }
        }
        System.out.println(c);
    }
}

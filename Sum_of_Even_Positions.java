import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n1=0,n2=1,n3,c;
        c=sc.nextInt();
        int arr[]=new int[c];
        for(int i=0;i<c;i++){
            arr[i]=sc.nextInt();
            if(i%2==0){
                n1=n1+arr[i];
            }
        }
        System.out.println(n1);
    }
}
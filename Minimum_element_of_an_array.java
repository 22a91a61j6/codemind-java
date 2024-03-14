import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            
            
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        // for(int i=0;i<a;i++){
        //     if(arr[i]<arr[i+1]){
        //         System.out.println(arr[i]);
        //     }
        //     else{
        //         System.out.println(arr[i+1]);
        //     }
        // }
    }
}
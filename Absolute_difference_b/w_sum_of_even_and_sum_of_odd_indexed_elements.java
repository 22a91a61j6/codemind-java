import java.util.*;
public class test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0,v=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(i%2==0){
                c+=arr[i];
               
            }
            else{
                v=v+arr[i];
            }
        }
        int x=Math.abs(v-c);
        System.out.println(x);
    }
}
// if(i%2=
//         c=c+i;
  
               
//             }
//             else{
//                 v=v+i;
//             }
       
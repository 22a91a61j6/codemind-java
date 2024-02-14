import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i,k=0;
        int max = 0;
        for (i=a;i<=b;i++){
            int count = 0;
            int n = i;
            while(n != 1){
                count++;
                if(n%2 ==0){
                    n=n/2;
                }
                else{
                    n=(3*n)+1;
                }
            }
            if(count > k){
                k = count;
                max = i;
            }
        }
        System.out.print(max);
    }
}
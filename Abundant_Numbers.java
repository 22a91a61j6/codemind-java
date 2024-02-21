import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                c=c+i;
            }
        }
        //System.out.println(c);
        if(c>a){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

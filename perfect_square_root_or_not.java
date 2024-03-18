// Lev 4

import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double g=Math.pow(a,0.5)%1;
        if(g==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
import java.util.*;
public class test{  
    
    public static void main(String args[]){  
    int r,sum=0,temp;  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//It is the number variable to be checked for palindrome  
  
    temp=n;    
    while(n>0){
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
    }    
    if(temp==sum)
        System.out.println("True");    
    else    
        System.out.println("False");    
  }  
}  
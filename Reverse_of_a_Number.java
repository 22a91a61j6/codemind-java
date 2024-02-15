import java.util.*;
public class Test   
{
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r = 0;  
        int re=0;
        while(n != 0)  
        {  
            //remainder = re
            //reverse=r
            re = n % 10;  
            r = r * 10 + re;  
            n = n/10; 
        }  
        System.out.println(r); 
    }  
}  
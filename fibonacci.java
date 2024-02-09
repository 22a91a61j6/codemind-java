import java.util.*;

public class Test{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i;
        int count;  
        System.out.print(n1+" "+n2);//printing 0 and 1  
        
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();
        for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed  
        { 
            n3=n1+n2;  
              
            n1=n2;  
            n2=n3;  
            System.out.print(" "+n3);
        }  
        
        
    }
    
}

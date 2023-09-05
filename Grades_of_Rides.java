import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int hf=sc.nextInt();
        int sf=sc.nextInt();
        int ff=sc.nextInt();
        if(hf>50 && sf>60 && ff>100)
        {
            System.out.print(10);
        }
        else if(hf>50 && sf>60)
        {
            System.out.print(9);
        }
        else if(sf>60 && ff>100)
        {
            System.out.print(8);
        }
        else if(hf>50 && ff>100)
        {
            System.out.print(7);
        }
        else if(sf>60 || ff>100 || hf>50)
        {
            System.out.print(6);
        }
        else
        {
            System.out.print(5);
        }
    }
}
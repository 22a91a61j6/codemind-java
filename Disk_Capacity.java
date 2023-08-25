import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(n*a*b*1024);
    }
}
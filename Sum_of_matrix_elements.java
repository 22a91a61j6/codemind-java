import java.util.Scanner;
public class Test{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        int s=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
                s+=arr[i][j];
            }
        }
        System.out.println(s);
    }
}
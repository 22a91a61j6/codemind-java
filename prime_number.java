import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println("prime");
    else
      System.out.println("not a prime");
  }
}
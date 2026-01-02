
import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();

      if (c % 2 == 0) {
        if (a > b) {
          System.out.println("First");
        } else {
          System.out.println("Second");
        }
      } else {
        a += 1;
        if (a > b) {
          System.out.println("First");
        } else {
          System.out.println("Second");
        }
      }

    }
    sc.close();
  }
}

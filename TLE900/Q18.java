import java.util.*;

public class Q18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      boolean found = false;

      int newa = b - (c - b);

      if (newa >= a && newa % a == 0 && newa != 0) {
        found = true;
      }

      int newb = a + (c - a) / 2;
      if (newb >= b && (c - a) % 2 == 0 && newb % b == 0 && newb != 0) {
        found = true;
      }

      int newc = a + 2 * (b - a);
      if (newc >= c && newc % c == 0 && newc != 0) {
        found = true;
      }
      if (found) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}

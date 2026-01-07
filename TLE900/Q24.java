import java.util.*;

public class Q24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();

      if (a == b) {
        System.out.println(0 + " " + 0);
      } else {
        if (b > a) {
          long temp = a;
          a = b;
          b = temp;
        }

        long gcd = a - b;

        long move = Math.min(b % gcd, gcd - b % gcd);
        System.out.println(gcd + " " + move);
      }

    }
    sc.close();
  }
}

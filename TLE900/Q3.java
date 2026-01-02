import java.util.*;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();
      long x = sc.nextLong();

      long minsum = (k * (k + 1)) / 2;
      long start = n - k + 1;
      long maxsum = k * (n + start) / 2;
      if (n >= k && x >= minsum && x <= maxsum) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}

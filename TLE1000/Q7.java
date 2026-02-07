import java.util.*;

public class Q7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      long[] a = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
      }

      long[] b = new long[n];
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextLong();
      }

      long[] c = new long[2 * n + 1];
      long[] d = new long[2 * n + 1];

      long counter = 1;

      for (int i = 1; i < n; i++) {
        if (a[i] == a[i - 1]) {
          counter++;
        } else {
          int idx = (int) a[i - 1];
          c[idx] = Math.max(c[idx], counter);
          counter = 1;
        }
      }
      c[(int) a[n - 1]] = Math.max(c[(int) a[n - 1]], counter);

      counter = 1;
      for (int i = 1; i < n; i++) {
        if (b[i] == b[i - 1]) {
          counter++;
        } else {
          int idx = (int) b[i - 1];
          d[idx] = Math.max(d[idx], counter);
          counter = 1;
        }
      }
      d[(int) b[n - 1]] = Math.max(d[(int) b[n - 1]], counter);

      long ans = 0;
      for (int i = 1; i <= 2 * n; i++) {
        ans = Math.max(ans, c[i] + d[i]);
      }

      System.out.println(ans);
    }

    sc.close();
  }
}

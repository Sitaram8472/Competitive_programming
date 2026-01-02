import java.util.*;

public class Q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int q = sc.nextInt();

      int[] num = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        num[i] = sc.nextInt();
      }

      long[] prefix = new long[n + 1];
      for (int i = 1; i <= n; i++) {
        prefix[i] = prefix[i - 1] + num[i];
      }
      long totalsum = prefix[n];

      for (int j = 1; j <= q; j++) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        long k = sc.nextInt();

        long oldsum = prefix[r] - prefix[l - 1];
        int len = r - l + 1;
        long newsum = totalsum - oldsum + len * k;

        System.out.println(((newsum & 1) == 0) ? "NO" : "YES");

      }

    }
    sc.close();
  }
}

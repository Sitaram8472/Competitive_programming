import java.util.*;

public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();
      long q = sc.nextLong();

      long[] num = new long[(int) n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextLong();
      }

      long ans = 0;
      long curr = 0;
      for (int i = 0; i < n; i++) {
        if (num[i] <= q) {
          curr++;
        } else {
          if (curr >= k) {
            long diff = curr - k + 1;
            ans += diff * (diff + 1) / 2;
          }
          curr = 0;
        }

      }

      if (curr >= k) {
        long diff = curr - k + 1;
        ans += diff * (diff + 1) / 2;
      }

      System.out.println(ans);

    }
    sc.close();
  }
}

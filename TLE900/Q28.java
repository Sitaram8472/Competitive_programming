import java.util.*;

public class Q28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int size = n * k;
      int[] num = new int[size];

      for (int i = 0; i < n * k; i++) {
        num[i] = sc.nextInt();
      }

      long ans = 0;

      if (n == 2) {
        for (int i = 0; i < size; i += 2) {
          ans += num[i];
        }
      } else {
        int median = n / 2;
        if (n % 2 == 0) {
          median--;
        }

        int gap = n - median;
        int idx = size - gap;
        for (int i = 1; i <= k; i++) {
          ans += num[idx];
          idx -= gap;
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}

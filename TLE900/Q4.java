import java.util.*;

public class Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      int n = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      long ans = 0;
      for (int i = 0; i < n; i++) {
        ans += Math.min(a - 1, arr[i]);
      }
      System.out.println(ans + b);
    }
    sc.close();
  }
}

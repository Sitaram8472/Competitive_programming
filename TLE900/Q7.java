import java.util.*;

public class Q7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();
      long[] arr = new long[(int) n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }
      long cnt = 1;

      if (n == 1) {
        System.out.println(0);
        continue;
      }
      Arrays.sort(arr);
      long max = 0;
      for (int i = 1; i < n; i++) {
        long diff = Math.abs(arr[i] - arr[i - 1]);
        if (diff <= k) {
          cnt++;
        } else {
          cnt = 1;
        }
        max = Math.max(max, cnt);
      }
      System.out.println(n-max);

    }
    sc.close();
  }
}

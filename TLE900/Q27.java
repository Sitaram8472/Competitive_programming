import java.util.*;

public class Q27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] num = new int[n];
      long minsum = 0;
      long maxsum = 0;

      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        minsum += num[i];
        maxsum += (num[i] + k - 1) / k;
      }
      long a = (minsum + k - 1) / k;

      System.out.println(a + " " + maxsum);

    }
    sc.close();
  }
}

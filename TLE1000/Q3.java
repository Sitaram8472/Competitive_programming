import java.util.*;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int p = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int[] cost = new int[n];
      for (int i = 0; i < n; i++) {
        cost[i] = sc.nextInt();
      }
      int[][] pair = new int[n][2];
      for (int i = 0; i < n; i++) {
        pair[i][0] = cost[i];
        pair[i][1] = num[i];
      }

      Arrays.sort(pair, (a, b) -> a[0] - b[0]);

      long maxcost = p;
      long notify = 1;

      for (int i = 0; i < n && notify < n; i++) {
        if (pair[i][0] < p) {
          long canshare = Math.min(pair[i][1], n - notify);
          maxcost += canshare * pair[i][0];
          notify += canshare;
        } else {
          break;
        }
      }

      if (notify < n) {
        maxcost += (n - notify) * p;
      }

      System.out.println(maxcost);

    }
    sc.close();
  }
}

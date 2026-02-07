import java.util.*;

public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] num = new int[n];
      int[] ans = new int[n];

      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int[][] arr = new int[n][2];

      for (int i = 0; i < n; i++) {
        arr[i][0] = num[i] % k;
        if (arr[i][0] == 0) {
          arr[i][0] = k;
        }
        arr[i][1] = i + 1;
      }

      Arrays.sort(arr, (a, b) -> {
        if (a[0] != b[0]) {
          return Integer.compare(b[0], a[0]);
        } else {
          return Integer.compare(a[1], b[1]);
        }

      });

      for (int i = 0; i < n; i++) {
        ans[i] = arr[i][1];
      }

      for (int i = 0; i < n; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();

    }
    sc.close();
  }
}

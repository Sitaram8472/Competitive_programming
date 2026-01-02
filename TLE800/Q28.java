import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int prefix = arr[0];
      boolean found = true;

      for (int i = 1; i < n; i++) {
        if (prefix != arr[i]) {
          found = false;
          break;
        }

      }

      if (found) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
        Arrays.sort(arr);
        System.out.print(arr[n - 1] + " ");
        for (int i = 0; i < n - 1; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }

    }
  }
}

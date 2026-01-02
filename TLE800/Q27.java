import java.util.Scanner;

public class Q27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      int cnt2 = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if (arr[i] == 2) {
          cnt2++;
        }
      }

      if ((cnt2 & 1) == 1) {
        System.out.println(-1);
      } else if (cnt2 == 0) {
        System.out.println(1);
      } else {
        int curr = 0;
        for (int i = 0; i < n; i++) {
          if (arr[i] == 2) {
            curr++;
          }
          if (curr == cnt2 / 2) {
            System.out.println(i + 1);
            break;
          }
        }
      }

    }
  }
}

import java.util.*;

public class Q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        if (num[i] == 1) {
          num[i] = 2;
        }
      }

      for (int i = 1; i < n; i++) {
        if (num[i] % num[i - 1] == 0) {
          num[i]++;
        }
      }

      for (int i = 0; i < n; i++) {
        System.out.print(num[i] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

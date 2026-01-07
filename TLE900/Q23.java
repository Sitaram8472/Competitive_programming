import java.util.*;

public class Q23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int total = num[0];
      for (int i = 1; i < n; i++) {
        total &= num[i];
      }

      System.out.println(total);

    }
    sc.close();
  }
}

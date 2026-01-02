import java.util.*;

public class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      int min = 10000;
      int max = -1;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        min = Math.min(min, num[i]);
        max = Math.max(max, num[i]);
      }

      System.out.println(max - min);

    }
    sc.close();
  }
}

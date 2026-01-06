import java.util.*;

public class Q22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int cnt1 = 0;
      int cnt0 = 0;
      for (int i = 0; i < n; i++) {
        if (num[i] == 1) {
          cnt1++;
        } else if (num[i] == 0) {
          cnt0++;
        }
      }

      long way = (int) Math.pow(2, cnt0) * cnt1;
      System.out.println(way);

    }
    sc.close();
  }
}

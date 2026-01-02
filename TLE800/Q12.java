import java.util.ArrayList;
import java.util.Scanner;

public class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] b = new long[n];
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextLong();
      }
      ArrayList<Long> a = new ArrayList<>();
      a.add(b[0]);
      for (int i = 1; i < n; i++) {
        if (b[i] < b[i - 1]) {
          a.add(b[i]);
        }
        a.add(b[i]);
      }
      System.out.println(a.size());
      for (long num : a) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

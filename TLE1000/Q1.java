import java.util.*;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = s.length();

      int cnt1 = 0;
      int cnt0 = 0;

      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          cnt1++;
        } else {
          cnt0++;
        }
      }
      int len = 0;

      for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        if (ch == '1' && cnt0 > 0) {
          len++;
          cnt0--;
        } else if (ch == '0' && cnt1 > 0) {
          cnt1--;
          len++;
        } else {
          break;
        }
      }

      System.out.println(n - len);

    }
    sc.close();
  }
}

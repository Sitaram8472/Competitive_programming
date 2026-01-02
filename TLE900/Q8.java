import java.util.*;

public class Q8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int cnt1 = 0;
      int cnt2 = 0;

      for (int i = 0; i < n;) {

        if (s.charAt(i) == '<') {
          int curr = 0;
          while (i < n && s.charAt(i) == '<') {
            curr++;
            i++;
          }
          cnt1 = Math.max(cnt1, curr);

        } else {
          int curr = 0;
          while (i < n && s.charAt(i) == '>') {
            curr++;
            i++;
          }
          cnt2 = Math.max(cnt2, curr);
        }
      }

      System.out.println(Math.max(cnt1, cnt2) + 1);

    }
    sc.close();
  }
}

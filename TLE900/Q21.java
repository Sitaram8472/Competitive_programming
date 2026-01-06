import java.util.*;

public class Q21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      String s = sc.next();
      int n = s.length();
      int ans = Integer.MAX_VALUE;

      String[] endings = { "00", "25", "50", "75" };

      for (String end : endings) {
        int pos2 = -1, pos1 = -1;

        for (int i = n - 1; i >= 0; i--) {
          if (s.charAt(i) == end.charAt(1)) {
            pos2 = i;
            break;
          }
        }

        if (pos2 == -1)
          continue;
        for (int i = pos2 - 1; i >= 0; i--) {
          if (s.charAt(i) == end.charAt(0)) {
            pos1 = i;
            break;
          }
        }

        if (pos1 == -1)
          continue;
        int deletions = (n - pos1 - 2);
        ans = Math.min(ans, deletions);
      }

      System.out.println(ans);
    }

    sc.close();
  }
}

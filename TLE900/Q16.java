import java.util.*;

public class Q16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    sc.nextLine();
    while (t-- > 0) {
      String s = sc.next();
      String y = sc.next();

      int n = s.length();

      int m = y.length();
      int[] freq = new int[26];
      for (int i = 0; i < m; i++) {
        freq[y.charAt(i) - 'A']++;
      }

      StringBuilder sb = new StringBuilder();
      for (int i = n - 1; i >= 0; i--) {
        if (freq[s.charAt(i) - 'A'] > 0) {
          freq[s.charAt(i) - 'A']--;
          sb.append(s.charAt(i));
        }
      }

      sb.reverse();
      if (sb.toString().equals(y)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
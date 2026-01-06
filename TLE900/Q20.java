import java.util.*;

public class Q20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      String s = sc.next();
      int n = s.length();

      int ab = 0, ba = 0;
      for (int i = 0; i < n - 1; i++) {
        if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b')
          ab++;
        else if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a')
          ba++;
      }

      StringBuilder sb = new StringBuilder(s);

      if (ab == ba || n <= 1) {
        System.out.println(s);
        continue;
      }

      if (ab > ba) {
        for (int i = 0; i < n - 1 && ab > ba; i++) {
          if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
            sb.setCharAt(i, 'b');
            ab--;
          }
        }
      } else {
        for (int i = 0; i < n - 1 && ba > ab; i++) {
          if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
            sb.setCharAt(i, 'a');
            ba--;
          }
        }
      }

      System.out.println(sb.toString());
    }

    sc.close();
  }
}

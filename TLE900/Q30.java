import java.util.*;

public class Q30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int cnt = 0;

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (sb.length() > 0) {
          if (sb.charAt(sb.length() - 1) != s.charAt(i)) {
            cnt++;
            sb.deleteCharAt(sb.length() - 1);
          } else {
            sb.append(s.charAt(i));
          }
        } else {
          sb.append(s.charAt(i));
        }
      }
      if ((cnt & 1) == 0) {
        System.out.println("NET");
      } else {
        System.out.println("DA");
      }
    }
    sc.close();
  }
}

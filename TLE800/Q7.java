import java.util.*;

public class Q7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {

      int n = sc.nextInt();
      int m = sc.nextInt();
      String x = sc.next();
      String s = sc.next();

      System.out.println(dontcount(x, s));

    }
    sc.close();
  }

  public static int dontcount(String x, String s) {
    if (x.contains(s)) {
      return 0;
    }

    StringBuilder sb = new StringBuilder(x);
    int oper = 0;

    while (sb.length() < s.length() || !sb.toString().contains(s)){
      sb.append(sb);
      oper++;
      if(sb.length()>s.length()*2 && !sb.toString().contains(s)){
        return -1;
      }
    }

    return oper;
  }

}

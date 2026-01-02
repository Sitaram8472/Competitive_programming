import java.util.*;

public class Repetitions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    long n = 0;
    long curr = 1;

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        curr++;
      } else if (str.charAt(i) != str.charAt(i + 1)) {
        curr = 1;
      }
      n = Math.max(n, curr);
    }
    if (str.length() == 1) {
      System.out.println(1);
    } else {
      System.out.println(n);
    }

    sc.close();
  }
}
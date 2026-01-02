import java.util.*;

public class Q26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      if ((n & n - 1) == 0) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }

    }
    sc.close();
  }
}

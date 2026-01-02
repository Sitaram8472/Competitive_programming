import java.util.*;

public class A_Walking_Master {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();

      if (b > d) {
        System.out.println(-1);
      } else if (a + (d - b) < c) {
        System.out.println(-1);
      } else {
        System.out.println((d - b) + (a + (d - b) - c));
      }

    }
    sc.close();
  }
}
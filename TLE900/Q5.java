import java.util.*;

public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      if (n % 2 == 0) {
        System.out.println(2);
        System.out.println(1 + " " +n);
        System.out.println(1 + " " + n);
      } else {
        System.out.println(4);
        System.out.println(1 + " " + 2);
        System.out.println(1 + " " + 2);
        System.out.println(2 + " " + n);
        System.out.println(2 + " " + n);
      }

    }
    sc.close();
  }
}

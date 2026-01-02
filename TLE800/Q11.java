import java.util.Scanner;

public class Q11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    long oper = Long.MAX_VALUE;
    boolean found = false;

    for (int i = 0; i < n; i++) {
      long num = sc.nextLong();

      if (num == 0) {
        found = true;
      } else {
        oper = Math.min(oper, Math.abs(num));
      }

    }

    if (found) {
      System.out.println(0);
    } else {
      System.out.println(oper);
    }

  }

}

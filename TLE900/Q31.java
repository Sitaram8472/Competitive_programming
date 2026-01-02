import java.util.*;

public class Q31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextInt();
      long cnt = 0;
      while (n > 1) {
        if (n % 6 != 0 && n % 2 != 0) {
          n *= 2;
          cnt++;
        }
        if (n % 6 != 0 && n % 2 == 0) {

          break;
        }
        if (n % 6 == 0) {
          n /= 6;
          cnt++;
        }

      }
      if (n == 1) {
        System.out.println(cnt);
      } else {
        System.out.println(-1);
      }

    }
    sc.close();
  }
}

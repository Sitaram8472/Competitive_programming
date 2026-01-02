import java.util.*;

public class Q26 {

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      boolean found = false;
      for (int i = 0; i < n && !found; i++) {
        for (int j = i + 1; j < n; j++) {
          if (gcd(arr[i], arr[j]) <= 2) {
            found = true;
            break;
          }
        }
      }

      if (found) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }

    }
  }
}

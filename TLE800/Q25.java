import java.util.Scanner;

public class Q25 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String str = sc.next();

      int i = 0;
      int j = n - 1;
      int ans = n;

      while (i <= j) {
        if (str.charAt(i) != str.charAt(j)) {
          ans -= 2;
        } else {
          break;
        }
        i++;
        j--;
      }
      System.out.println(ans);

    }
  }
}

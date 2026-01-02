import java.util.Scanner;

public class Q18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      if (n % k != 0) {
        System.out.println(1);
        System.out.println(n);
      } else {
        System.out.println(2);
        System.out.println(n-1 + " " + 1);

      }

    }
  }

}

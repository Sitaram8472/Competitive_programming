import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int sum = 0;
      int[] arr = new int[n];
      for (int i = 0; i < n - 1; i++) {
        sum += sc.nextInt();
      }
      System.out.println(-sum);
    }

  }
}

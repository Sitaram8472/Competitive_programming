import java.util.Scanner;

public class Q24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] arr = new int[n];
      long xor = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        xor = xor ^ arr[i];
      }

      if (n % 2 == 1) {
        System.out.println(xor);
      } else {
        if (xor == 0) {
          System.out.println(8);
        } else {
          System.out.println(-1);
        }
      }

    }
    sc.close();
  }
}

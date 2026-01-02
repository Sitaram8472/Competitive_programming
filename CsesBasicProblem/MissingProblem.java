
// import java.util.Arrays;
import java.util.Scanner;

public class MissingProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long currsum = 0;
    for (int i = 0; i < n-1; i++) {
      currsum += sc.nextInt();
    }

    // Arrays.sort(arr);

    // if (n == 2) {
    // if (arr[0] == 2) {
    // System.out.println(1);
    // }
    // if (arr[0] == 1) {
    // System.out.println(2);
    // }
    // }

    // for (int i = 1; i < n - 1; i++) {
    // if (arr[i] != arr[i - 1] + 1) {
    // System.out.println(i + 1);
    // break;
    // } else if (i == n - 2) {
    // System.out.println(i + 2);
    // break;
    // }

    long totalsum = n * (n + 1) / 2;

    System.out.println(totalsum - currsum);

     sc.close();
  }
}

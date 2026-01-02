import java.util.Scanner;

public class increasingarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int diff = 0;
    int max = 0;
    for (int i = 0; i < n - 1; i++) {
      max = Math.max(arr[i], arr[i + 1]);
      if (arr[i] > arr[i + 1]) {
        diff += Math.abs(max - arr[i]);
        if (arr[i] < max) {
          diff += Math.abs(arr[i] - arr[i + 1]);
        }
      }
    }

    System.out.println(diff);

    sc.close();

  }
}

import java.util.*;

public class A_Desorting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(minimumopertaion(arr));

    }
  }

  public static int minimumopertaion(int[] arr) {
    int n = arr.length;
    int minoper = Integer.MAX_VALUE;

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return 0;
      }
    }

    for (int i = 1; i < n; i++) {
      minoper = Math.min(minoper, (arr[i] - arr[i - 1]));
    }

    return (minoper / 2) + 1;

  }
}
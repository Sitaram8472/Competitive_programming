import java.util.*;

public class Q31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();

    char[] arr = s.toCharArray();

    char[] minRight = new char[n];
    minRight[n - 1] = arr[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      minRight[i] = (char) Math.min(arr[i], minRight[i + 1]);
    }

    int l = -1;
    int r = -1;

    for (int i = 0; i < n - 1; i++) {
      if (minRight[i + 1] < arr[i]) {
        l = i;
        break;
      }
    }

    if (l == -1) {
      System.out.println("NO");
      return;
    }

    for (int i = n - 1; i > l; i--) {
      if (arr[i] == minRight[l + 1]) {
        r = i;
        break;
      }
    }

    System.out.println("YES");
    System.out.println((l + 1) + " " + (r + 1));
  }
}

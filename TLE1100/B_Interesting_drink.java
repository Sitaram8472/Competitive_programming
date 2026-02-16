import java.util.*;
import java.io.*;

public class B_Interesting_drink {

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    int q = sc.nextInt();

    while (q-- > 0) {
      int m = sc.nextInt();
      int count = upperBound(arr, m);
      out.println(count);
    }

    out.flush();
  }

  static int upperBound(int[] arr, int target) {
    int low = 0, high = arr.length;

    while (low < high) {
      int mid = (low + high) / 2;

      if (arr[mid] <= target) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }

    return low;
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}

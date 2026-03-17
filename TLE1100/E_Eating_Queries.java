
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class E_Eating_Queries {

  /**
   * author: sitaram sahu
   * created: 17.03.2026 18:48:15
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    int q = sc.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums);
    long[] pre = new long[n];
    pre[0] = nums[n - 1];
    int k = n - 2;
    for (int i = 1; i < n; i++) {
      pre[i] = pre[i - 1] + nums[k];
      k--;
    }

    while (q-- > 0) {
      long x = sc.nextInt();
      int ans = -1;
      int i = 1;
      int j = n;

      while (i <= j) {
        int mid = i + (j - i) / 2;
        if (pre[mid - 1] >= x) {
          ans = mid;
          j = mid - 1;
        } else {
          i = mid + 1;
        }

      }
      System.out.println(ans);

    }

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
          String line = br.readLine();
          if (line == null)
            return null;
          st = new StringTokenizer(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
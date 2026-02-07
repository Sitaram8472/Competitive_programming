
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q13 {
  /**
   * author: sitaram sahu
   * created: 15.01.2026 22:10:57
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int x = sc.nextInt();
    long[] nums = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextLong();
    }

    int ans = 0;
    long min = nums[1];
    long max = nums[1];

    for (int i = 2; i <= n; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }

      if (max - min > x * 2) {
        ans++;
        min = max = nums[i];
      }
    }

    System.out.println(ans);

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

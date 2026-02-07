
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q33 {
  /**
   * author: sitaram sahu
   * created: 16.01.2026 19:43:36
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
    long[] nums = new long[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextLong();
    }

    int cnt = 0;
    int cnt2 = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] % 2 != 0) {
        cnt++;
      } else {
        cnt2++;
      }
    }
    System.out.println(Math.min(cnt, cnt2));

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


/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Distinct_Elements {

  /**
   * author: sitaram sahu
   * created: 24.03.2026 19:54:29
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
    long[] nums = new long[n + 1];
    nums[0] = 0;
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextLong();
    }

    long[] res = new long[n];

    for (int i = 0; i < n; i++) {
      long diff = nums[i + 1] - nums[i];
      if (i - diff >= 0) {
        res[i] = res[(int) (i - diff)];
      } else {
        res[i] = i + 1;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(res[i] + " ");
    }

    System.out.println();
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
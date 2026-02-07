
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q12 {
  /**
   * author: sitaram sahu
   * created: 14.01.2026 23:25:27
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    long n = sc.nextLong();
    long k = sc.nextLong();
    long b = sc.nextLong();
    long s = sc.nextLong();

    long min = k * b;
    long max = (k * b) + (k - 1) * n;
    if (s < min || s > max) {
      System.out.println(-1);
    } else {
      long[] nums = new long[(int) n];
      nums[0] = min;
      s -= min;
      for (int i = 0; i < n; i++) {
        long add = Math.min(k - 1, s);
        nums[i] += add;
        s -= add;
      }

      for (long x : nums) {
        System.out.print(x + " ");
      }
      System.out.println();
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

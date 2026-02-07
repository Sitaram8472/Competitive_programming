
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q24 {
  /**
   * author: sitaram sahu
   * created: 24.01.2026 15:37:05
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
    int m = sc.nextInt();

    int min = Integer.MAX_VALUE;
    int sum = 0;
    int neg = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < m; j++) {
        int num = sc.nextInt();
        min = Math.min(Math.abs(num), min);
        sum += Math.abs(num);
        if (num < 0) {
          neg++;
        }

      }
    }

    if (neg % 2 != 0) {
      System.out.println(sum - (2 * min));
    } else {
      System.out.println(sum);

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

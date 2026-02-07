
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q21 {
  /**
   * author: sitaram sahu
   * created: 21.01.2026 19:24:53
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    String a = sc.next();
    String b = sc.next();

    if (a.equals(b)) {
      System.out.println(0);
      return;
    }

    int n = a.length();
    int m = b.length();
    int ans = 0;
    for (int len = 1; len <= Math.min(n, m); len++) {
      for (int i = 0; i + len <= n; i++) {
        for (int j = 0; j + len <= m; j++) {
          if (a.substring(i, i + len).equals(b.substring(j, j + len))) {
            ans = Math.max(ans, len);
          }
        }
      }
    }
    System.out.println(n + m - 2 * ans);

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

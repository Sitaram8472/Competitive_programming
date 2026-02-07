
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q32 {
  /**
   * author: sitaram sahu
   * created: 15.01.2026 22:51:32
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

    String a = sc.next();
    String b = sc.next();

    Boolean same = true;
    for (int i = 1; i < m; i++) {
      if (a.charAt(i + n - m) != b.charAt(i)) {
        same = false;
        break;
      }
    }

    if (!same) {
      System.out.println("NO");
      return;
    }

    for (int i = 0; i < n - m + 1; ++i) {
      if (a.charAt(i) == b.charAt(0)) {
        same = false;
        break;
      }
    }

    if (same) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
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

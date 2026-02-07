
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q15 {
  /**
   * author: sitaram sahu
   * created: 19.01.2026 23:02:11
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
    int k = sc.nextInt();
    String s = sc.next();

    int firstw = 0;
    for (int i = 0; i < k; i++) {
      if (s.charAt(i) == 'W') {
        firstw++;
      }
    }

    int min = firstw;
    for (int i = k; i < n; i++) {
      if (s.charAt(i - k) == 'W') {
        firstw--;
      }
      if (s.charAt(i) == 'W') {
        firstw++;
      }
      min = Math.min(min, firstw);
    }
    System.out.println(min);

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

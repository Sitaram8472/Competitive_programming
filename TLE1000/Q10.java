
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q10 {
  /**
   * author: sitaram sahu
   * created: 01.02.2026 21:15:31
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
    String ch = sc.next();
    String s = sc.next();

    n *= 2;
    s += s;

    int g = -1;
    int max = 0;

    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == 'g') {
        g = i;
      }
      if (s.charAt(i) == ch.charAt(0)) {
        int diff = g - i;
        max = Math.max(max, diff);
      }
    }

    System.out.println(max);
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

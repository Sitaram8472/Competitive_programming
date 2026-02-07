
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q29 {
  /**
   * author: sitaram sahu
   * created: 28.01.2026 23:49:41
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
    long a = sc.nextLong();
    long b = sc.nextLong();

    long aa = a;
    long bb = b;
    while (aa % 2 == 0) {
      aa /= 2;
    }

    while (bb % 2 == 0) {
      bb /= 2;
    }

    if (aa != bb) {
      System.out.println(-1);

    } else {
      a /= aa;
      b /= bb;
      a = (long) (Math.log(a) / Math.log(2));
      b = (long) (Math.log(b) / Math.log(2));
      long ans = (long) Math.ceil(Math.abs(a - b) / 3.0);
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

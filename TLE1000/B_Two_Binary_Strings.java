
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Two_Binary_Strings {

  /**
   * author: sitaram sahu
   * created: 16.04.2026 20:06:47
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
    String a = sc.next();
    String b = sc.next();

    boolean ok = false;
    for (int i = 0; i < a.length() - 1; i++) {
      if (a.charAt(i) == b.charAt(i) && a.charAt(i) == '0' && a.charAt(i + 1) == b.charAt(i + 1)
          && a.charAt(i + 1) == '1') {
        ok = true;
      }
    }

    System.out.println(ok ? "YES" : "NO");

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
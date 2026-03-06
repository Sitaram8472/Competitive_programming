
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Way_Too_Long_Words {

  /**
   * author: sitaram sahu
   * created: 25.02.2026 00:30:42
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    while (n-- > 0) {
      String s = sc.next();
      if (s.length() <= 10) {
        System.out.println(s);
        continue;
      }

      System.out.println(s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1));
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
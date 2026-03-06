
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Watermelon {

  /**
   * author: sitaram sahu
   * created: 25.02.2026 00:03:26
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

    if (n % 2 != 0) {
      System.out.println("NO");
    } else {
      if (n % 2 == 0 && n > 2) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

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
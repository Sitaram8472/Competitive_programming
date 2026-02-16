
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q38 {
  /**
   * author: sitaram sahu
   * created: 10.02.2026 18:16:48
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    System.out.println(solve());
    out.flush();
    out.close();
  }

  private static String solve() {
    int n = sc.nextInt();

    int a = 0;
    int b = 0;
    int c = 0;

    while (n-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      a += x;
      b += y;
      c += z;

    }
    if (a == 0 && b == 0 && c == 0) {
      return "YES";
    } else {
      return "NO";
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

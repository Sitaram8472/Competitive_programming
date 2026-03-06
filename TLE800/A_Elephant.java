
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Elephant {

  /**
   * author: sitaram sahu
   * created: 05.03.2026 20:55:42
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

    int cnt = 0;
    while (n > 0) {
      if (n >= 5) {

        n -= 5;
      } else if (n >= 4) {

        n -= 4;
      } else if (n >= 3) {

        n -= 3;
      } else if (n >= 2) {

        n -= 2;
      } else {

        n -= 1;
      }
      cnt++;
    }

    System.out.println(cnt);
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
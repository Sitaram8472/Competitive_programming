
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Lucky_Division {

  /**
   * author: sitaram sahu
   * created: 10.03.2026 08:01:55
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
    boolean found = false;
    int[] lucky = {
        4, 7,
        44, 47, 74, 77,
        444, 447, 474, 477, 744, 747, 774, 777
    };
    for (int x : lucky) {
      if (n % x == 0) {
        found = true;
      }

    }

    if (found) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
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
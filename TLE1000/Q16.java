
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q16 {
  /**
   * author: sitaram sahu
   * created: 19.01.2026 23:37:08
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
    int r = sc.nextInt();
    int b = sc.nextInt();

    int group = b + 1;
    int shift = r / group;
    int extrar = r % group;

    for (int i = 0; i < group; i++) {
      int base = shift + (extrar > 0 ? 1 : 0);
      extrar--;
      for (int j = 0; j < base; j++) {
        System.out.print('R');
      }
      if (i < b) {
        System.out.print('B');
      }

    }
    System.out.println();

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

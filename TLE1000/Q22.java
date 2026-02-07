
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q22 {
  /**
   * author: sitaram sahu
   * created: 22.01.2026 13:40:03
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int a = sc.nextInt();
    int b = sc.nextInt();

    int cnt = Integer.MAX_VALUE;
    for (int i = 0; i < 32; i++) {
      int oper = i;
      int newb = b + oper;
      if (newb == 1) {
        continue;
      }
      int newa = a;

      while (newa > 0) {
        newa /= newb;
        oper++;
      }
      cnt = Math.min(cnt, oper);
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

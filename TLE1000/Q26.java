
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q26 {

  /**
   * author: sitaram sahu
   * created: 24.01.2026 16:28:38
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
    long x = sc.nextLong();
    long y = sc.nextLong();
    long k = sc.nextLong();

    long coalstickneed = k * y;
    long forstickneed = k;
    long toatalstickneed = coalstickneed + forstickneed - 1;

    long need = (toatalstickneed + (x - 2)) / (x - 1);

    System.out.println(need + k);

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
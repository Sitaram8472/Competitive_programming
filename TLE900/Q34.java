
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q34 {
  /**
   * author: sitaram sahu
   * created: 06.02.2026 18:56:28
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    long n = sc.nextLong();
    long m = sc.nextLong();
    long a = sc.nextLong();
    System.out.println(solve(n, m, a));
    out.flush();
    out.close();
  }

  private static long solve(long n, long m, long a) {
    long len = (m + a - 1) / a;
    long len2 = (n + a - 1) / a;

    return len * len2;

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


/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q32 {
  /**
   * author: sitaram sahu
   * created: 03.02.2026 21:57:18
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    long n = sc.nextLong();
    long k = sc.nextLong();
    System.out.println(solve(n, k));

    out.flush();
    out.close();
  }

  private static long solve(long n, long k) {

    long cnt = (n + 1) / 2;

    if (k <= cnt) {
      return 2 * k - 1;
    } else {
      return (2 * (k - cnt));
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

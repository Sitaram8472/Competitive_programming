
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q27 {
  /**
   * author: sitaram sahu
   * created: 26.01.2026 22:52:28
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
    long n = sc.nextLong();

    while (!isfair(n)) {
      n += 1;
    }
    System.out.println(n);

  }

  private static boolean isfair(long n) {
    long num = n;
    while (num != 0) {
      long x = num % 10;
      if (x != 0 && n % x != 0) {
        return false;
      }
      num /= 10;

    }

    return true;
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

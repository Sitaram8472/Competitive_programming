
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_Place_of_the_Olympiad {

  /**
   * author: sitaram sahu
   * created: 23.04.2026 10:46:56
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
    long m = sc.nextLong();
    long k = sc.nextLong();

    long low = 0, high = m, ans = m;

    while (low <= high) {

      long mid = (low + high) / 2;
      if (can(n, m, k, mid)) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }
    System.out.println(ans);

  }

  private static boolean can(long n, long m, long k, long x) {
    long block = m / (x + 1);
    long rem = m % (x + 1);
    long perblock = block * x + (Math.min(rem, x));
    long toatlblock = perblock * n;
    return toatlblock >= k;
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
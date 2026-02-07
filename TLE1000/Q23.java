
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q23 {
  /**
   * author: sitaram sahu
   * created: 22.01.2026 15:38:02
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    long n = sc.nextLong();
    long p = nextprime(n + 1);
    long x = nextprime(p + n);
    System.out.println(p * x);
  }

  private static boolean isprime(long n) {
    if (n < 2) {
      return false;
    }

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  private static long nextprime(long n) {
    while (!isprime(n)) {
      n++;
    }
    return n;
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


/**
 * author:  sitaram sahu
**/

import java.util.*;

import javax.print.DocFlavor.READER;

import java.io.*;

public class B_Minimum_Product {

  /**
   * author: sitaram sahu
   * created: 19.02.2026 15:26:13
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
    long a = sc.nextInt();
    long b = sc.nextInt();
    long x = sc.nextInt();
    long y = sc.nextInt();
    long n = sc.nextInt();

    long min1 = Integer.MAX_VALUE;
    long min2 = Integer.MAX_VALUE;

    long reducea = Math.min(n, a - x);
    long newa = a - reducea;
    long rem = n - reducea;
    long newb = b - Math.min(rem, b - y);
    min1 = newa * newb;

    long reducebb = Math.min(n, b - y);
    long newbb = b - reducebb;
    long rem2 = n - reducebb;
    long newaa = a - Math.min(rem2, a - x);
    min2 = newaa * newbb;

    System.out.println(Math.min(min1, min2));

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
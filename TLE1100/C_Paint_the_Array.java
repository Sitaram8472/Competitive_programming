
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Paint_the_Array {

  /**
   * author: sitaram sahu
   * created: 18.02.2026 23:23:09
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
    int n = sc.nextInt();
    long[] nums = new long[n];

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextLong();
    }

    long even = 0;
    long odd = 0;

    for (int i = 0; i < n; i += 2) {
      even = gcd(even, nums[i]);
    }

    for (int i = 1; i < n; i += 2) {
      odd = gcd(odd, nums[i]);
    }

    boolean found = even != 0;
    for (int i = 1; i < n && found; i += 2) {
      if (nums[i] % even == 0) {
        found = false;
      }
    }

    if (found) {
      System.out.println(even);
      return;
    }

    boolean foundOdd = odd != 0;
    for (int i = 0; i < n && foundOdd; i += 2) {
      if (nums[i] % odd == 0) {
        foundOdd = false;
      }
    }

    if (foundOdd) {
      System.out.println(odd);
    } else {
      System.out.println(0);
    }
  }

  public static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
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
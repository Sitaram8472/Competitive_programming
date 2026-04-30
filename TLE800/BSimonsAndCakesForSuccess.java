
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class BSimonsAndCakesForSuccess {

  /**
   * author: sitaram sahu
   * created: 25.04.2026 20:33:58
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
    long k = 1;
    long temp = n;
    for (int i = 2; i * i <= temp; i++) {
      if (temp % i == 0) {
        k *= i;
        while (temp % i == 0) {
          temp /= i;

        }
      }
    }

    if (temp > 1) {
      k *= temp;
    }

    System.out.println(k);

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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Perfect_Number {

  /**
   * author: sitaram sahu
   * created: 19.02.2026 14:57:14
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    int k = sc.nextInt();
    int cnt = 0;

    for (int i = 10; i <= 100000000; i++) {
      int currsum = digitsum(i);
      if (currsum == 10) {
        cnt++;
      }
      if (cnt == k) {
        System.out.println(i);
        return;
      }
    }
  }
 
  private static int digitsum(int n) {
    int sum = 0;
    while (n > 0) {
      int rem = n % 10;
      sum += rem;
      n /= 10;
    }
    return sum;
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
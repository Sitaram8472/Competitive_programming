
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Different_Differences {

  /**
   * author: sitaram sahu
   * created: 17.04.2026 20:10:57
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
    int k = sc.nextInt();
    int n = sc.nextInt();

    int[] a = new int[k];
    a[0] = 1;

    int diff = 1;

    for (int i = 1; i < k; i++) {
      if (a[i - 1] + diff <= n - (k - i - 1)) {
        a[i] = a[i - 1] + diff;
        diff++;
      } else {
        a[i] = a[i - 1] + 1;
      }
    }

    for (int x : a) {
      System.out.print(x + " ");
    }
    System.out.println();
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Most_Similar_Words {

  /**
   * author: sitaram sahu
   * created: 17.03.2026 19:39:22
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
    int m = sc.nextInt();

    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int curr = 0;
        for (int k = 0; k < m; k++) {
          curr += Math.abs(s[i].charAt(k) - s[j].charAt(k));
        }
        min = Math.min(curr, min);
      }
    }

    System.out.println(min);

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
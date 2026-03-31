
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Wonderful_Sticks {

  /**
   * author: sitaram sahu
   * created: 31.03.2026 21:26:25
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
    String s = sc.next();

    int[] ans = new int[n];

    int l = 1;
    int r = n;
    for (int i = n - 2; i >= 0; i--) {
      if (s.charAt(i) == '<') {
        ans[i + 1] = l;
        l++;
      }
      if (s.charAt(i) == '>') {
        ans[i + 1] = r;
        r--;
      }
    }
    ans[0] = l;
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
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
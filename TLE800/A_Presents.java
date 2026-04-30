
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Presents {

  /**
   * author: sitaram sahu
   * created: 19.04.2026 17:11:53
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    int[] nums = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextInt();
    }

    int[] ans = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      ans[nums[i]] = i;
    }

    for (int i = 1; i <= n; i++) {
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
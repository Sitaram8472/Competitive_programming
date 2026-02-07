
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q17 {
  /**
   * author: sitaram sahu
   * created: 20.01.2026 22:09:36
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int k = n - 2;
    int[] nums = new int[n];
    for (int i = 0; i < n - 1; i++) {
      nums[i] = k;
      k--;
    }
    nums[n - 1] = n - 1;

    for (int x : nums) {
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

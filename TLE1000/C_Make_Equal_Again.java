
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Make_Equal_Again {

  /**
   * author: sitaram sahu
   * created: 10.04.2026 18:32:13
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
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int l = 0;
    int r = 0;
    while (l < n && nums[l] == nums[0]) {
      l++;
    }

    while (r < n && nums[n - r - 1] == nums[n - 1]) {
      r++;
    }

    int result = n;

    if (nums[0] == nums[n - 1]) {
      result -= l;
      result -= r;
    } else {
      result -= Math.max(l, r);
    }

    System.out.println(Math.max(0, result));

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
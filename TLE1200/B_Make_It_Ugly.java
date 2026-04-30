
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Make_It_Ugly {
  /**
   * author: sitaram sahu
   * created: 18.04.2026 22:04:42
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

    int left = -1;
    int ans = n;
    for (int i = 1; i < n; i++) {
      if (nums[i] != nums[0]) {
        ans = Math.min(ans, i - left - 1);
        left = i;
      }
      ans = Math.min(ans, n - left - 1);
    }

    if (ans == n) {
      System.out.println(-1);
    } else {
      System.out.println(ans);
    }

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

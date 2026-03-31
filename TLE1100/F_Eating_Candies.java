
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class F_Eating_Candies {

  /**
   * author: sitaram sahu
   * created: 25.03.2026 09:14:33
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

    int[] pre1 = new int[n];
    pre1[0] = nums[0];
    int[] pre2 = new int[n];
    pre2[n - 1] = nums[n - 1];

    for (int i = 1; i < n; i++) {
      pre1[i] = pre1[i - 1] + nums[i];
    }

    for (int i = n - 2; i >= 0; i--) {
      pre2[i] = pre2[i + 1] + nums[i];
    }

    int ans = 0;
    int curr = 0;
    int i = 0;
    int j = n - 1;
    while (i < j) {
      if (pre1[i] == pre2[j]) {
        curr = i + (n - j) + 1;
        i++;
        j--;
      } else if (pre1[i] > pre2[j]) {
        j--;
      } else {
        i++;
      }
      ans = Math.max(curr, ans);
    }

    System.out.println(ans);

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
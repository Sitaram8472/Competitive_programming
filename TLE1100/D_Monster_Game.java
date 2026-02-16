
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_Monster_Game {

  /**
   * author: sitaram sahu
   * created: 09.02.2026 09:59:27
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
    Integer[] nums = new Integer[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextInt();
    }

    int[] nums2 = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nums2[i] = sc.nextInt();
    }

    Arrays.sort(nums, 1, n + 1, Collections.reverseOrder());
    int h = 0;
    int sum = 0;
    long ans = 0;
    for (int i = 1; i <= n; i++) {
      while (h < n && sum + nums2[h + 1] <= i) {
        h++;
        sum += nums2[h];
      }

      ans = Math.max(ans, nums[i] * 1L * h);
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
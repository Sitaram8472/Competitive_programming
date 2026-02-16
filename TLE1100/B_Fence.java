
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Fence {

  /**
   * author: sitaram sahu
   * created: 15.02.2026 13:39:00
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
    int k = sc.nextInt();

    int[] nums = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextInt();
    }

    int idx = 1;
    int sum = 0;
    int i = 1;
    while (i <= k) {
      sum += nums[i];
      i++;
    }
    int temp = sum;
    while (i <= n) {
      sum -= nums[i - k];
      sum += nums[i];
      if (sum < temp) {
        idx = i - k + 1;
        temp = sum;
      }
      i++;
    }

    System.out.println(idx);

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
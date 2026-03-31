
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class E_Negatives_and_Positives {

  /**
   * author: sitaram sahu
   * created: 20.03.2026 07:07:55
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
    int neg = 0;
    int zero = 0;
    long sum = 0;
    int minabs = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      if (nums[i] < 0) {
        neg++;
      }
      if (nums[i] == 0) {
        zero++;
      }
      minabs = Math.min(minabs, Math.abs(nums[i]));
      sum += Math.abs(nums[i]);
    }

    if (neg % 2 == 0 || zero > 0) {
      System.out.println(sum);
    } else {
      System.out.println(sum - (2L * minabs));
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
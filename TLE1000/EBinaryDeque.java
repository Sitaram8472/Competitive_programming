
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class EBinaryDeque {

  /**
   * author: sitaram sahu
   * created: 24.04.2026 22:25:57
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
    int s = sc.nextInt();

    int[] nums = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      sum += nums[i];
    }

    if (sum < s) {
      System.out.println(-1);
      return;
    }
    int left = 0, curr = 0, max = -1;
    for (int i = 0; i < n; i++) {
      curr += nums[i];
      while (curr > s) {
        curr -= nums[left++];
      } 
      if (curr == s) {
        max = Math.max(max, i - left + 1);
      }
    }
    System.out.println(n - max);
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
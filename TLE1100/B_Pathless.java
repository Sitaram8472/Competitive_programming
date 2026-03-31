
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Pathless {

  /**
   * author: sitaram sahu
   * created: 26.03.2026 20:36:08
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
    int k = sc.nextInt();

    int[] nums = new int[3];
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      nums[num]++;
    }

    int minsum = nums[1] + 2 * nums[2];

    if (k == minsum || k >= minsum + 2) {
      System.out.println(-1);
      return;
    } else {
      for (int i = 0; i < nums[0]; i++) {
        System.out.print(0 + " ");
      }
      for (int i = 0; i < nums[2]; i++) {
        System.out.print(2 + " ");
      }
      for (int i = 0; i < nums[1]; i++) {
        System.out.print(1 + " ");
      }
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
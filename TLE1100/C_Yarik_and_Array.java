
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Yarik_and_Array {

  /**
   * author: sitaram sahu
   * created: 19.03.2026 20:55:04
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

    if (n == 1) {
      System.out.println(nums[0]);
      return;
    }

    int maxsum = nums[0];
    int currsum = nums[0];

    for (int i = 1; i < n; i++) {
      if (nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) {
        currsum = nums[i];
      } else if (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0) {
        currsum = nums[i];
      } else {
        currsum = Math.max(nums[i], currsum + nums[i]);
      }
      maxsum = Math.max(maxsum, currsum);

      if (currsum < 0) {
        currsum = 0;
      }
    }

    System.out.println(maxsum);

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
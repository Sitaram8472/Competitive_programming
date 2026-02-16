
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q11 {
  /**
   * author: sitaram sahu
   * created: 13.02.2026 18:19:53
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

    Integer[] nums = new Integer[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums, Collections.reverseOrder());

    int i = 0;
    int j = n - 1;
    long sum = 0;
    while (k-- > 0) {
      int min = nums[i] + nums[i + 1];
      int max = nums[j];
      if (max > min) {
        sum += max;
        j--;
      } else {
        sum += min;
        i += 2;
      }

    }

    while (i <= j) {
      sum += nums[i];
    }
    System.out.println(sum);

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

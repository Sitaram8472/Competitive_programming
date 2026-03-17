
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Mahmoud_and_a_Triangle {

  /**
   * author: sitaram sahu
   * created: 13.03.2026 13:19:06
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
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    boolean found = false;

    Arrays.sort(nums);
    for (int i = 0; i < n - 2; i++) {
      if (nums[i] + nums[i + 1] > nums[i + 2] && nums[i] + nums[i + 2] > nums[i + 1]
          && nums[i + 2] + nums[i + 1] > nums[i]) {
        found = true;
      }
    }

    System.out.println(found ? "YES" : "NO");

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
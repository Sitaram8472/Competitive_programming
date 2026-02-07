
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q11 {
  /**
   * author: sitaram sahu
   * created: 02.02.2026 15:08:09
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    // int testCases = sc.nextInt();
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(search(n, d, nums));
    out.flush();
    out.close();
  }

  private static int search(int n, int d, int[] nums) {

    int cnt = 0;
    int i = 0;
    int j = n - 1;
    while (i < n) {
      if (nums[i] + nums[j] >= d) {
        cnt++;
        i++;
      } else {
        j--;
      }
    }
    return cnt;

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

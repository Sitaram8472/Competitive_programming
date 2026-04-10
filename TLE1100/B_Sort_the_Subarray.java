
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Sort_the_Subarray {

  /**
   * author: sitaram sahu
   * created: 04.04.2026 11:01:52
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
    int[] sort = new int[n];
    for (int i = 0; i < n; i++) {
      sort[i] = sc.nextInt();
    }

    int i = 0;
    int j = n - 1;

    while (i < n && sort[i] == nums[i]) {
      i++;
    }
    while (i > 0 && sort[i - 1] <= sort[i]) {
      i--;
    }
    while (j >= 0 && sort[j] == nums[j]) {
      j--;
    }

    while (j < n - 1 && sort[j] <= sort[j + 1]) {
      j++;
    }

    System.out.println((i + 1) + " " + (j + 1));

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
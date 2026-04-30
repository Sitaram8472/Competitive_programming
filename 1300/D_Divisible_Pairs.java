
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_Divisible_Pairs {

  /**
   * author: sitaram sahu
   * created: 11.04.2026 17:44:18
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
    int x = sc.nextInt();
    int y = sc.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    long pair = 0;
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int a = nums[i] % x;
      int b = nums[i] % y;

      int needa = (x - a) % x;
      String needkey = needa + "#" + b;

      pair += map.getOrDefault(needkey, 0);

      String needb = a + "#" + b;
      map.put(needb, map.getOrDefault(needb, 0) + 1);

    }
    out.println(pair);
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q8 {
  /**
   * author: sitaram sahu
   * created: 01.02.2026 20:47:35
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
    String s = sc.next();

    Set<Character> set = new HashSet<>();
    int[] q1 = new int[n + 1];
    int[] q2 = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      set.add(s.charAt(i - 1));
      q1[i] = set.size();
    }
    set.clear();

    for (int i = n; i >= 1; i--) {
      set.add(s.charAt(i - 1));
      q2[i] = set.size();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(max, (q1[i] + q2[i + 1]));
    }

    System.out.println(max);

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

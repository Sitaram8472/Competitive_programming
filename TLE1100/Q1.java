
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q1 {
  /**
   * author: sitaram sahu
   * created: 13.02.2026 18:04:27
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

    Map<Character, Integer> map = new HashMap<>();
    int[] dist = new int[n];
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);

      if (map.get(ch) == 1) {
        cnt++;
      }

      dist[i] = cnt;
    }

    int total = 0;
    for (int x : dist) {
      total += x;
    }
    System.out.println(total);
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

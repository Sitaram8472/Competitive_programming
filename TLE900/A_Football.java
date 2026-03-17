
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Football {
  /**
   * author: sitaram sahu
   * created: 08.03.2026 07:54:52
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

    HashMap<String, Integer> map = new HashMap<>();
    while (n-- > 0) {
      String s = sc.next();

      map.put(s, map.getOrDefault(s, 0) + 1);

    }
    String ans = "";
    int cnt = 0;
    for (String x : map.keySet()) {
      if (map.get(x) > cnt) {
        cnt = map.get(x);
        ans = x;
      }
    }

    System.out.println(ans);

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

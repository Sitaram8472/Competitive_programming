
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Game_with_Doors {

  /**
   * author: sitaram sahu
   * created: 11.03.2026 19:02:12
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
    int l = sc.nextInt();
    int r = sc.nextInt();

    int L = sc.nextInt();
    int R = sc.nextInt();

    if (r < L || R < l) {
      System.out.println(1);
    } else {
      int ans = Math.min(R, r) - Math.max(L, l);
      if (l != L)
        ans++;
      if (r != R)
        ans++;
      System.out.println(ans);
    }

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
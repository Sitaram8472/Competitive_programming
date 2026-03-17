
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Sum_of_Digits {

  /**
   * author: sitaram sahu
   * created: 10.03.2026 08:30:52
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    String n = sc.next();
    int cnt = 0;

    while (n.length() > 1) {
      int sum = 0;

      for (int i = 0; i < n.length(); i++) {
        sum += n.charAt(i) - '0';
      }

      n = String.valueOf(sum);
      cnt++;
    }

    System.out.println(cnt);
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
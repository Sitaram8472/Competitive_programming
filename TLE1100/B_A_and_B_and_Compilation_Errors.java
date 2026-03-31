
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_A_and_B_and_Compilation_Errors {

  /**
   * author: sitaram sahu
   * created: 18.03.2026 22:54:39
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

    long suma = 0;
    long sumb = 0;
    long sumc = 0;

    for (int i = 0; i < n; i++) {
      suma += sc.nextInt();
    }

    for (int i = 0; i < n - 1; i++) {
      sumb += sc.nextInt();
    }

    for (int i = 0; i < n - 2; i++) {
      sumc += sc.nextInt();
    }

    System.out.println(suma - sumb);
    System.out.println(sumb - sumc);

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
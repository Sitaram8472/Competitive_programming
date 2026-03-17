
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Petr_and_Book {

  /**
   * author: sitaram sahu
   * created: 12.03.2026 09:16:58
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
    int[] week = new int[8];
    for (int i = 1; i <= 7; i++) {
      week[i] = sc.nextInt();
    }

 
    while (true) {
      for (int i = 1; i <= 7; i++) {
        if (n <= week[i]) {
          System.out.println(i);
          return;
        }
        n -= week[i];
      }

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
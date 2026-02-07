
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q36 {
  /**
   * author: sitaram sahu
   * created: 07.02.2026 16:00:28
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp = a;
    int cnt = 0;
    int d = b;
    while (temp >= d) {
      temp -= b;
      temp += 1;
      cnt++;
    }

    System.out.println(cnt + a);
    out.flush();
    out.close();
  }

  private static void solve() {
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int temp = a;
    // int cnt = 0;
    // int d = b;
    // while (temp < d) {
    // temp -= b;
    // temp += 1;
    // cnt++;
    // }

    // System.out.println(cnt + a);

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


/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q20 {
  /**
   * author: sitaram sahu
   * created: 20.01.2026 22:38:35
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int a = sc.nextInt();
    int b = sc.nextInt();

    int arrXor;
    int c = (a - 1) % 4;

    if (c == 0) {
      arrXor = a - 1;
    } else if (c == 1) {
      arrXor = 1;
    } else if (c == 2) {
      arrXor = a;
    } else {
      arrXor = 0;
    }

    if (arrXor == b) {
      System.out.println(a);
    } else if ((arrXor ^ b) != a) {
      System.out.println(a + 1);
    } else {
      System.out.println(a + 2);
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

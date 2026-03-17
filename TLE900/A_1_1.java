
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_1_1 {

  /**
   * author: sitaram sahu
   * created: 09.03.2026 08:13:34
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

    int cnt1 = 0;
    for (char ch : s.toCharArray()) {
      if (ch == '1') {
        cnt1++;
      }
    }

    if (cnt1 <= 1) {
      System.out.println(cnt1 + " " + cnt1);
      return;
    }

    int first = s.indexOf('1');
    int last = s.lastIndexOf('1');

    int maxone = last - first + 1;
    int blocks = 0;
    int i = 0;

    while (i < n) {
      if (s.charAt(i) == '1') {
        blocks++;
        while (i < n && s.charAt(i) == '1') {
          i++;
        }
      } else {
        i++;
      }
    }

    int minone = blocks + 1;

    System.out.println(minone + " " + maxone);

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
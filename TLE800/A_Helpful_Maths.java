
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Helpful_Maths {

  /**
   * author: sitaram sahu
   * created: 01.03.2026 22:03:35
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    String s = sc.next();

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != '+') {
        list.add(s.charAt(i) - '0');
      }
    }

    Collections.sort(list);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i));
      if (i != list.size() - 1) {
        sb.append('+');
      }

    }

    out.println(sb.toString());
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
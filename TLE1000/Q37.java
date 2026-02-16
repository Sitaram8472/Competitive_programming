
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q37 {
  /**
   * author: sitaram sahu
   * created: 10.02.2026 17:56:39
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    String s = sc.next();
    System.out.println(solve(s));
    out.flush();
    out.close();
  }

  private static String solve(String s) {
    StringBuilder sb = new StringBuilder();
    String vowel = "AEIOUaeiouyY";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (vowel.indexOf(ch) == -1) {
        sb.append(".");
        sb.append(Character.toLowerCase(ch));
      }
    }

    return sb.toString();

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


/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Specialty_String {

  /**
   * author: sitaram sahu
   * created: 06.03.2026 08:08:04
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

    Stack<Character> stack = new Stack<>();
    int i = 0;
    while (i < n) {
      if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
      i++;
    }

    System.out.println(stack.isEmpty() ? "YES" : "NO");
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
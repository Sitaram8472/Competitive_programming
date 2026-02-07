
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q28 {
  /**
   * author: sitaram sahu
   * created: 28.01.2026 21:22:21
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
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == ')') {
        if (!stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else {
          stack.push(s.charAt(i));
        }
      } else {
        if (s.charAt(i) == '(') {
          stack.push(s.charAt(i));
        } else {
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          } else {
            stack.push(s.charAt(i));
          }
        }
      }

    }

    System.out.println(stack.size() / 2);

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

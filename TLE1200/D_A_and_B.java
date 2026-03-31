
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_A_and_B {

  /**
   * author: sitaram sahu
   * created: 28.03.2026 18:16:38
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

    System.out.println(Math.min(find(s, 'a'), find(s, 'b')));

  }

  private static long find(String s, char ch) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ch) {
        list.add(i);
      }
    }

    int k = list.size();
    if (k <= 1) {
      return 0;
    }

    for (int i = 0; i < k; i++) {
      list.set(i, list.get(i) - i);
    }

    int median = list.get(k / 2);
    long oper = 0;
    for (int x : list) {
      oper += Math.abs(x - median);
    }

    return oper;

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
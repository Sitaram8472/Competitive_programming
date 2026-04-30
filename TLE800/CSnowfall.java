
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class CSnowfall {

  /**
   * author: sitaram sahu
   * created: 30.04.2026 23:39:14
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

    ArrayList<Integer> both = new ArrayList<>();
    ArrayList<Integer> both2 = new ArrayList<>();
    ArrayList<Integer> both3 = new ArrayList<>();
    ArrayList<Integer> neither = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int curr = sc.nextInt();
      if (curr % 6 == 0) {
        both.add(curr);
      } else if (curr % 2 == 0) {
        both2.add(curr);
      } else if (curr % 3 == 0) {
        both3.add(curr);
      } else {
        neither.add(curr);
      }
    }

    int idx = 0;
    int[] ans = new int[n];
    for (int x : both) {
      ans[idx++] = x;
    }

    for (int x : both2) {
      ans[idx++] = x;
    }

    for (int x : neither) {
      ans[idx++] = x;
    }

    for (int x : both3) {
      ans[idx++] = x;
    }
    for (int x : ans) {
      System.out.print(x + " ");
    }
    System.out.println();

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
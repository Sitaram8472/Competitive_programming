
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Indivisible {

  /**
   * author: sitaram sahu
   * created: 12.04.2026 23:19:59
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

    if (n == 1) {
      System.out.println(1);
    } else if (n % 2 == 1) {
      System.out.println(-1);
    } else {
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
      }

      for (int i = 0; i < n; i += 2) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }

      for (int x : arr) {
        System.out.print(x + " ");
      }
      System.out.println();

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
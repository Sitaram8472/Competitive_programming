
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Laptops {

  /**
   * author: sitaram sahu
   * created: 15.02.2026 14:31:31
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  static class laptop {

    int price, quality;

    laptop(int p, int q) {
      this.price = p;
      this.quality = q;
    }

  }

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    laptop[] arr = new laptop[n];

    for (int i = 0; i < n; i++) {
      arr[i] = new laptop(sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(arr, (a, b) -> a.price - b.price);

    for (int i = 0; i < n - 1; i++) {
      if (arr[i].quality > arr[i + 1].quality) {
        System.out.println("Happy Alex");
        return;
      }
    }
    System.out.println("Poor Alex");

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
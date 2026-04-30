
/**
 * author:  sitaram sahu
**/

import java.util.*;

import javax.print.DocFlavor.STRING;

import java.io.*;

public class B_Count_the_Number_of_Pairs {

  /**
   * author: sitaram sahu
   * created: 15.04.2026 21:02:08
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
    int k = sc.nextInt();

    String s = sc.next();

    int[] small = new int[26];
    int[] big = new int[26];
    for (int i = 0; i < n; i++) {
      if (Character.isLowerCase(s.charAt(i))) {
        small[s.charAt(i) - 'a']++;
      } else {
        big[s.charAt(i) - 'A']++;
      }
    }

    int cnt = 0;

    for (int i = 0; i < 26; i++) {
      int min = Math.min(small[i], big[i]);
      cnt += min;
      int max = Math.max(small[i], big[i]) - min;
      big[i] = max;
    }

    for (int i = 0; i < 26; i++) {
      int abs = big[i] / 2;
      if (k > abs) {
        cnt += abs;
        k -= abs;
      } else {
        while (k > 0) {
          cnt++;
          k--;
        }
      }
    }

    System.out.println(cnt);

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
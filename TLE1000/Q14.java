
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Q14 {
  /**
   * author: sitaram sahu
   * created: 16.01.2026 20:05:19
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    boolean found = true;

    for (int x : map.values()) {
      if (x == 1) {
        found = false;
        break;
      }
    }
    if (!found) {
      System.out.println(-1);
      return;
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    int l = 0;

    for (int r = 0; r < n; r++) {
      if (nums[r] != nums[l]) {
        Collections.rotate(list.subList(l, r), -1);
        l = r;
      }
    }

    Collections.rotate(list.subList(l, n), -1);

    for (int x : list) {
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

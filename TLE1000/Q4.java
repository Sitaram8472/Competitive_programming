
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long secrowmin = Integer.MAX_VALUE;
      long secrowsum = 0;
      long entiremin = Integer.MAX_VALUE;
      while (n-- > 0) {
        int m = sc.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
          num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        secrowsum += num[1];
        secrowmin = Math.min(secrowmin, num[1]);
        entiremin = Math.min(num[0], entiremin);
      }

      System.out.println(secrowsum + entiremin - secrowmin);

    }
    sc.close();
  }
}

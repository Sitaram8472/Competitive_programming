import java.util.*;

public class Q2 {
  static int[] parent;
  static long[] sumWithRoot;
  static int[] size;
  static long[] extra;

  static int find(int x) {
    if (parent[x] == x)
      return x;
    int p = find(parent[x]);
    extra[x] += extra[parent[x]];
    return parent[x] = p;
  }

  static void union(int x, int y, long k) {
    int rx = find(x);
    int ry = find(y);
    if (rx == ry)
      return;
    if (size[rx] < size[ry]) {
      parent[rx] = ry;
      extra[rx] = k - extra[x] - extra[y];
      size[ry] += size[rx];
    } else {
      parent[ry] = rx;
      extra[ry] = k - extra[x] - extra[y];
      size[rx] += size[ry];
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    parent = new int[n + 1];
    extra = new long[n + 1];
    size = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      parent[i] = i;
      extra[i] = 0;
      size[i] = 1;
    }
    while (q-- > 0) {
      int t = sc.nextInt();
      if (t == 1) {
        int i = sc.nextInt();
        int j = sc.nextInt();
        long k = sc.nextLong();
        union(i, j, k);
      } else {
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (find(i) != find(j)) {
          System.out.println(-1);
        } else {
          long ans = extra[i] + extra[j];
          System.out.println(ans);
        }
      }
    }
  }
}

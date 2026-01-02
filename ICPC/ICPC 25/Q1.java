import java.util.*;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      Map<String, int[]> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        String word = sc.next();
        int val = sc.nextInt();

        map.putIfAbsent(word, new int[2]);
        map.get(word)[val]++;
      }

      int ans = 0;
      for (String key : map.keySet()) {
        int zero = map.get(key)[0];
        int one = map.get(key)[1];
        ans += Math.max(zero, one);
      }

      System.out.println(ans);
    }

  }

}

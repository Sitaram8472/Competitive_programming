import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();

      HashMap<Character, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }

      int cnt = 0;
      for (int num : map.values()) {
        if (num % 2 != 0) {
          cnt++;
        }
      }

       if (cnt == 0) {
        System.out.println("YES");
      } else if (k >= cnt-1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}

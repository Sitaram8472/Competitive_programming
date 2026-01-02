
import java.util.*;

public class Q29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] p = new int[n];
      for (int i = 0; i < n; i++) {
        p[i] = sc.nextInt();
      }

      boolean found = false;

      for (int i = 1; i < n; i++) {
        List<Integer> list = new ArrayList<>();
        boolean left = false;
        boolean right = false;

        for (int j = i; j >= 0; j--) {
          if (p[i] > p[j]) {
            left = true;
            list.add(i);
            list.add(j);
            break;
          }
        }

        for (int k = i; k < n; k++) {
          if (p[i] > p[k]) {
            right = true;
            list.add(k);
            break;
          }
        }

        if (left && right) {
          System.out.println("YES");
          Collections.sort(list);
          for (int a = 0; a < 3; a++) {
            System.out.print(list.get(a) + 1 + " ");
          }
          System.out.println();
          found = true;
          break;

        }

      }
      if (!found) {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}

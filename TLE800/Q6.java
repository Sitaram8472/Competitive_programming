import java.util.HashMap;
import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      int nums[] = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }

      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      }

      if (map.size() > 2) {
        System.out.println("No");
      } else if (map.size() == 1) {
        System.out.println("Yes");
      } else {
        
        int diff = 0;
        for (int x : map.values()) {
          diff = Math.abs(x - diff);
        }
        if (diff < 2) {
          System.out.println("yes");
        } else {
          System.out.println("NO");
        }

      }

    }
    sc.close();
  }
}

import java.util.Scanner;

public class Q2 {

  public static int linetrip(int[] nums, int x) {
    int n = nums.length;
    int max = nums[0];
    for(int i=1; i<n; i++){
      int abs = Math.abs(nums[i]-nums[i-1]);
      max = Math.max(abs, max);
    }
    max = Math.max(max, Math.abs(nums[n-1]-x)*2);

    return max;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] nums = new int[n];

      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }

      System.out.println(linetrip(nums, x));

    }
    sc.close();
  }
}

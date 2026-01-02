import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      int nums[] = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }

      boolean sorted = true;
      while (sorted) {
        sorted = false;
        for (int i = 1; i < n - 1; i++) {
          if (nums[i + 1] < nums[i] && nums[i] > nums[i + 1]) {
            int temp  = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            sorted = true;
          }
        }
      }

      boolean found = true;
      for (int i = 1; i < n; i++) {
        if(nums[i]<nums[i-1]){
          found = false;
          break;
        }
      }
      if(found){
        System.out.println("Yes");
      } else{
        System.out.println("No");
      }

    }
    sc.close();
  }
}

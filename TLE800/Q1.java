import java.util.*;

public class Q1 {

  public static boolean canBeSorted(int[] nums, int k) {
    int  n = nums.length;
    if(n==1 && k == 1){
      return true;
    }
    
    int count = 0;
    for(int i=1; i<n; i++){
      if(nums[i]>=nums[i-1]){
        count++;
      } else if (n>1 && k == 1) {
        return false;
      }
    }
    if(count == n){
      return true;
    } 
    return true;

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] nums = new int[n];

      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }
      
      if(canBeSorted(nums, k)){
        System.out.println("yes");
      } else{
        System.out.println("no");
      }

    }
    sc.close();
  }
}

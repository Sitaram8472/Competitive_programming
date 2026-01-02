import java.util.*;

public class Q13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);
      if (arr[0] == arr[n - 1]) {
        System.out.println(-1);
        continue;
      }
      int len = 1;
      for(int i=1; i<n; i++) {
        if(arr[i] == arr[0]) {
          len++;
        } else {
          break;
        }
      }

      System.out.println(len + " " + (n - len));
      for(int i=0; i<len; i++) {
        System.out.print(arr[i] + (i == len-1 ? "\n" : " "));
      }

      for(int i=len; i<n; i++) {
        System.out.print(arr[i] + (i == n-1 ? "\n" : " "));
      }
      
    }
    sc.close();
  }
}
import java.util.*;

public class Q29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      if(arr.length <=1){
        System.out.println(0);
        continue;
      }

      int oper = 0;
      int len = 1;
      for (int i = 1; i < arr.length; i++) {
          if((arr[i] & 1) == (arr[i-1] & 1)) {
            len++;
          } else  {
            oper += (len-1);
            len = 1;
          }
      }
      // for (int i = 0; i < n-1; i++) {
      //   if(arr[i] % 2 == 0 && arr[i+1] % 2 ==0){
      //     oper++;
      //   } 
      //   if(arr[i] % 2 != 0 && arr[i+1] % 2 !=0){
      //     oper++;
      //   }
      // }

      if(len > 1) {
        oper += (len-1);
      }

      System.out.println(oper);
    }
  }
}

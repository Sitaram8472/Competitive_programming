import java.util.Scanner;

public class Q19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int pos = 0;
      int neg = 0;
      for (int i = 0; i < n; i++) {
        if (arr[i] == 1) {
          pos++;
        } else {
          neg++;
        }
      }

      int oper = 0;
      
      while (pos < neg || neg % 2 == 1) {
        pos++;
        neg--;
        oper++;
      }

     
      System.out.println(oper);


    }
  }
}

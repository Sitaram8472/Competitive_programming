import java.util.Scanner;

public class Q9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println(found(arr, k)? "YES" : "NO");

    }
    sc.close();
  }
  public static boolean found(int[] arr, int k){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == k){
        return true;
      }
    }
    return false;
  }
}

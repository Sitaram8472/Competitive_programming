import java.util.Scanner;

public class Q31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();

      if(a+b+2 <= n || (a==b && a==n)){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
      

    }
    sc.close();
  }

}

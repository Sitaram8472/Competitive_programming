import java.util.Scanner;

public class Q30 {

  public static long rec(long n){
    if(n<10){
      return n;
    }
    return (9+rec(n/10));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();

      System.out.println(rec(n));

    }
  }
}

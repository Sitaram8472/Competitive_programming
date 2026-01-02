import java.util.*;

public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      int i =1;
      while (n % i == 0) {
        i++;
      }
      System.out.println(i-1);
    }
    sc.close();
  }
}

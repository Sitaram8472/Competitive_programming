import java.util.Scanner;

public class WeiredProblem {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    if(n == 1){
      System.out.print(n);
    }

    while (n != 1) {
      
      if (n % 2 == 0) {
        System.out.print(n + " ");
        n /= 2;
      } else {
        System.out.print(n + " ");
        n *= 3;
        n += 1;
      }
      if(n == 1){
        System.out.print(n);
      }
    }
    sc.close();

  }

}
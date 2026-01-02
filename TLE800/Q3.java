import java.util.Scanner;

public class Q3 {
  
  public static int count(String s) {
    int maxcount = 0;
    int currval = 0;
    for(char ch : s.toCharArray()){
      if(ch == '.'){
        currval++;
        maxcount++;
      } else{
        currval = 0;
      }
      if(currval == 3){
        maxcount = 2;
        break;
      }
    }
    return maxcount;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      // int n = sc.nextInt();
      String s = sc.next();

      System.out.println(count(s));

    }
    sc.close();
  }
}

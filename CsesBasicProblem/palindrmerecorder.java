import java.util.*;

public class palindrmerecorder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();

    int[] arr = new int[26];

    for (int i = 0; i < str.length(); i++) {
      arr[str.charAt(i)]++;
    }

    StringBuilder sb = new StringBuilder();

    int cnt1 = 0;
    for (int i = 0; i < 26; i++) {
      if (arr[i] == 1) {
        cnt1++;
      }
      if (cnt1 > 1) {
        System.out.println("NO SOLUTION");
        break;
      }
    }

    Arrays.sort(arr);
    for (int i = 25; i >= 0; i--) {
      
    }

  }
}

import java.util.*;

public class submit {
  static ArrayList<String> list = new ArrayList<>();

  public static void solve(int n, int from, int to, int tar) {
    if (n == 0) {
      return;
    }
    solve(n - 1, from, tar, to);
    list.add(from + " " + to);
    solve(n - 1, tar, to, from);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    solve(n, 1, 3, 2);

    System.out.println(list.size());
    for (String s : list) {
      System.out.println(s);
    }
  }
}

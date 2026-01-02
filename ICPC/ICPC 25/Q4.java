import java.util.*;

public class Q4 {
    static boolean valid(int[] p) {
        int n = p.length, k = n / 2;
        int max1 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++)
            max1 = Math.max(max1, p[i]);
        for (int i = k; i < n; i++)
            min2 = Math.min(min2, p[i]);
        if (max1 < min2)
            return true;
        int min1 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++)
            min1 = Math.min(min1, p[i]);
        for (int i = k; i < n; i++)
            max2 = Math.max(max2, p[i]);
        return min1 > max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();

            if (valid(p)) {
                System.out.println(1);
                System.out.print(n + " ");
                for (int i = 0; i < n; i++)
                    System.out.print(p[i] + (i + 1 < n ? " " : "\n"));
            } else {
                System.out.println(2);
                System.out.print(2 + " " + p[0] + " " + p[n - 1] + "\n");
                System.out.print((n - 2) + " ");
                for (int i = 1; i < n - 1; i++)
                    System.out.print(p[i] + (i + 1 < n - 1 ? " " : "\n"));
            }
        }
    }
}
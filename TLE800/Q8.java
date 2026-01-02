import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        while (t-- > 0) {
            char[][] arr = new char[10][10];

            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                arr[i] = line.toCharArray();
            }

            System.out.println(found(arr));
        }

        sc.close();
    }

    public static int found(char[][] arr) {
        int sum = 0;
        int[] ringScores = {1, 2, 3, 4, 5}; // Rings from outer to inner

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == 'X') {
                    int distance = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                    sum += ringScores[distance];
                }
            }
        }

        return sum;
    }
}
import java.util.*;

public class ScoutsPaths {
    static int N, M;
    static List<List<Integer>> adj; 
    static int start1, start2, outpost;
    static ArrayList<Integer> paths1 = new ArrayList<>();
    static ArrayList<Integer> paths2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        adj = new ArrayList<>();
        for (int i = 0; i < N; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        start1 = sc.nextInt() - 1;
        start2 = sc.nextInt() - 1;
        outpost = sc.nextInt() - 1;

        dfs(start1, 1 << start1, paths1);
        dfs(start2, 1 << start2, paths2);

        int INF = 1000000;
        int ans = INF;

        for (int p1 : paths1) {
            for (int p2 : paths2) {
                if ((p1 & p2) == (1 << outpost)) {
                    int total = Integer.bitCount(p1 | p2);
                    ans = Math.min(ans, total);
                }
            }
        }

        System.out.println(ans == INF ? "Impossible" : ans);
    }

    static void dfs(int u, int mask, ArrayList<Integer> paths) {
        if (u == outpost) {
            paths.add(mask);
            return;
        }

        for (int v : adj.get(u)) {
            if ((mask & (1 << v)) == 0) {
                dfs(v, mask | (1 << v), paths);
            }
        }
    }
}

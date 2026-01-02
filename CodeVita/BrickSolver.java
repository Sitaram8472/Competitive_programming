import java.util.*;

public class BrickSolver {

    static class Brick {
        char type;
        List<int[]> cells = new ArrayList<>();

        Brick(char t) {
            type = t;
        }
    }

    static int size;
    static int[][] brickId;
    static Map<Integer, Brick> bricks = new HashMap<>();
    static Map<Integer, Set<Integer>> adj = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = Integer.parseInt(sc.nextLine().trim());
        brickId = new int[size][size];
        int id = 0;

        for (int r = 0; r < size; r++) {
            String line = sc.nextLine().trim().replace(" ", "");
            int idx = 0, c = 0;

            while (idx < line.length()) {
                int cnt = 0;
                while (idx < line.length() && Character.isDigit(line.charAt(idx))) {
                    cnt = cnt * 10 + (line.charAt(idx) - '0');
                    idx++;
                }

                char t = line.charAt(idx++);
                Brick b = new Brick(t);

                for (int k = 0; k < cnt; k++) {
                    if (c >= size)
                        return;
                    brickId[r][c] = id;
                    b.cells.add(new int[] { r, c });
                    c++;
                }

                bricks.put(id, b);
                id++;
            }

            if (c != size)
                return;
        }

        buildAdj();
        solve();
    }

    static void buildAdj() {
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                int a = brickId[r][c];
                for (int[] d : dir) {
                    int nr = r + d[0], nc = c + d[1];
                    if (nr >= 0 && nr < size && nc >= 0 && nc < size) {
                        int b = brickId[nr][nc];
                        if (a != b) {
                            adj.computeIfAbsent(a, k -> new HashSet<>()).add(b);
                        }
                    }
                }
            }
        }
    }

    static void solve() {
        List<Integer> start = new ArrayList<>();
        Set<Integer> end = new HashSet<>();

        for (int i : bricks.keySet()) {
            char t = bricks.get(i).type;
            if (t == 'S')
                start.add(i);
            if (t == 'D')
                end.add(i);
        }

        int ans = bfs(start, end);
        System.out.print(ans);
    }

    static int bfs(List<Integer> start, Set<Integer> end) {
        int INF = 1000000000;
        int n = bricks.size();
        int[] dist = new int[n];
        Arrays.fill(dist, INF);

        Deque<Integer> dq = new ArrayDeque<>();
        for (int s : start) {
            dist[s] = 0;
            dq.addFirst(s);
        }

        while (!dq.isEmpty()) {
            int u = dq.pollFirst();
            if (end.contains(u))
                return dist[u];

            if (!adj.containsKey(u))
                continue;

            for (int v : adj.get(u)) {
                char t = bricks.get(v).type;
                if (t == 'R')
                    continue;

                int w = (t == 'G') ? 1 : 0;
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    if (w == 0)
                        dq.addFirst(v);
                    else
                        dq.addLast(v);
                }
            }
        }

        return -1;
    }
}

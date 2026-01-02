import java.util.*;

public class CountTheShapes {
    static List<List<Integer>> adj;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<String, Integer> pointToIndex = new HashMap<>();
        adj = new ArrayList<>();
        int vertexCount = 0;

        int[][] segments = new int[N][4];
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            segments[i] = new int[] { x1, y1, x2, y2 };

            String p1 = x1 + ":" + y1;
            String p2 = x2 + ":" + y2;

            if (!pointToIndex.containsKey(p1)) {
                pointToIndex.put(p1, vertexCount++);
                adj.add(new ArrayList<>());
            }
            if (!pointToIndex.containsKey(p2)) {
                pointToIndex.put(p2, vertexCount++);
                adj.add(new ArrayList<>());
            }
        }

        for (int[] seg : segments) {
            String p1 = seg[0] + ":" + seg[1];
            String p2 = seg[2] + ":" + seg[3];

            int u = pointToIndex.get(p1);
            int v = pointToIndex.get(p2);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        visited = new boolean[vertexCount];
        int closedFigures = 0;

        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i]) {
                ComponentStats stats = new ComponentStats();
                dfsComponent(i, stats);
                int cycles = stats.edges / 2 - stats.vertices + 1;
                if (cycles > 0) {
                    closedFigures += cycles;
                }
            }
        }

        System.out.print(closedFigures);
    }

    static class ComponentStats {
        int vertices = 0;
        int edges = 0;
    }

    static void dfsComponent(int node, ComponentStats stats) {
        visited[node] = true;
        stats.vertices++;
        stats.edges += adj.get(node).size();
        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                dfsComponent(nei, stats);
            }
        }
    }
}

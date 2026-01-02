import java.util.*;

public class MahaKumbh {

    static boolean canTravel(String start, String end,
            Map<String, Set<String>> graph,
            Map<String, Set<String>> blocked) {
        if (start.equals(end))
            return true;
        Set<String> visited = new HashSet<>();
        Queue<String> q = new ArrayDeque<>();
        q.add(start);
        visited.add(start);

        Set<String> blockSet = blocked.getOrDefault(start, Collections.emptySet());

        while (!q.isEmpty()) {
            String current = q.poll();
            for (String neighbor : graph.getOrDefault(current, Collections.emptySet())) {
                if (visited.contains(neighbor))
                    continue;
                if (!neighbor.equals(start) && blockSet.contains(neighbor))
                    continue;
                if (neighbor.equals(end))
                    return true;
                visited.add(neighbor);
                q.add(neighbor);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, Set<String>> graph = new HashMap<>();

        for (int i = 0; i < n;) {
            String line = sc.nextLine().trim();
            if (line.isEmpty())
                continue;
            String[] parts = line.split("\\s+");
            String node = parts[0];
            graph.putIfAbsent(node, new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                graph.putIfAbsent(parts[j], new HashSet<>());
                graph.get(node).add(parts[j]);
                graph.get(parts[j]).add(node);
            }
            i++;
        }

        int q = Integer.parseInt(sc.nextLine().trim());
        List<String[]> queries = new ArrayList<>();

        for (int i = 0; i < q;) {
            String line = sc.nextLine().trim();
            if (line.isEmpty())
                continue;
            queries.add(line.split("\\s+"));
            graph.putIfAbsent(queries.get(queries.size() - 1)[0], new HashSet<>());
            graph.putIfAbsent(queries.get(queries.size() - 1)[2], new HashSet<>());
            i++;
        }

        int r = Integer.parseInt(sc.nextLine().trim());
        Map<String, Set<String>> restrictions = new HashMap<>();

        for (int i = 0; i < r;) {
            String line = sc.nextLine().trim();
            if (line.isEmpty())
                continue;
            String[] parts = line.split("\\s+");
            Set<String> blockedSet = restrictions.computeIfAbsent(parts[0], k -> new HashSet<>());
            for (int j = 1; j < parts.length; j++) {
                blockedSet.add(parts[j]);
                graph.putIfAbsent(parts[j], new HashSet<>());
            }
            graph.putIfAbsent(parts[0], new HashSet<>());
            i++;
        }

        for (String[] qItem : queries) {
            String a = qItem[0], op = qItem[1], b = qItem[2];
            switch (op) {
                case "to":
                    System.out.print(canTravel(a, b, graph, restrictions) ? "yes" : "no");
                    break;
                case "connects":
                    graph.get(a).add(b);
                    graph.get(b).add(a);
                    break;
                case "disconnects":
                    graph.getOrDefault(a, Collections.emptySet()).remove(b);
                    graph.getOrDefault(b, Collections.emptySet()).remove(a);
                    break;
            }
        }
    }
}

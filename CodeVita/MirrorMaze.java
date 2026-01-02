import java.util.*;

public class MirrorMaze {
  static int M, N;
  static char[][] grid;
  static boolean[][][] visited;

  static int[] dr = { -1, 0, 1, 0 };
  static int[] dc = { 0, 1, 0, -1 };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    M = sc.nextInt();
    N = sc.nextInt();
    grid = new char[M][N];

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        grid[i][j] = sc.next().charAt(0);
      }
    }

    visited = new boolean[M][N][4];
    int maxLoop = 0;

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        for (int d = 0; d < 4; d++) {
          if (!visited[i][j][d]) {
            int loopSize = explore(i, j, d);
            maxLoop = Math.max(maxLoop, loopSize);
          }
        }
      }
    }

    System.out.print(maxLoop);
  }

  static int explore(int r, int c, int dir) {
    Map<String, Integer> seen = new HashMap<>();
    int step = 0;
    int loopSize = 0;

    while (true) {
      if (r < 0 || r >= M || c < 0 || c >= N)
        return 0;

      String state = r + "," + c + "," + dir;
      if (seen.containsKey(state)) {
        loopSize = step - seen.get(state);
        break;
      }

      if (visited[r][c][dir])
        return 0;

      seen.put(state, step);
      visited[r][c][dir] = true;

      if (grid[r][c] == '/') {
        dir = reflectSlash(dir);
      } else if (grid[r][c] == '\\') {
        dir = reflectBackSlash(dir);
      }

      r += dr[dir];
      c += dc[dir];
      step++;
    }

    return loopSize;
  }

  static int reflectSlash(int dir) {

    switch (dir) {
      case 0:
        return 1;
      case 1:
        return 0;
      case 2:
        return 3;
      case 3:
        return 2;
    }
    return dir;
  }

  static int reflectBackSlash(int dir) {

    switch (dir) {
      case 0:
        return 3;
      case 3:
        return 0;
      case 2:
        return 1;
      case 1:
        return 2;
    }
    return dir;
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Stack;

class Q3 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());
    int T = Integer.parseInt(st.nextToken());

    while (T-- > 0) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());

      String S = br.readLine();

      HashSet<Character>[] penCapabilities = new HashSet[K];
      for (int i = 0; i < K; i++) {
        penCapabilities[i] = new HashSet<>();
        String P = br.readLine();
        for (char c : P.toCharArray()) {
          penCapabilities[i].add(c);
        }
      }

      int INF = N + 1;

      // dp[i][j]: minimum changes to write prefix S[0...i-1] ending with pen j
      int[][] dp = new int[N + 1][K];
      // prevSegmentEnd[i][j]: the segment start index (k) where the minimum changes
      // dp[i][j] was achieved from
      int[][] prevSegmentEnd = new int[N + 1][K];

      // lastPen[i][j]: the pen index (0 to K-1) used at position
      // 'prevSegmentEnd[i][j]' (before the current pen started)
      int[][] lastPen = new int[N + 1][K];

      for (int i = 0; i <= N; i++) {
        Arrays.fill(dp[i], INF);
      }
      // Base case: 0 characters written, 0 changes, previous pen irrelevant (-1)
      for (int j = 0; j < K; j++) {
        dp[0][j] = 0;
        prevSegmentEnd[0][j] = 0;
        lastPen[0][j] = -1;
      }

      // preCalc[i][j]: the segment start index (k) such that S[k..i-1] is the longest
      // continuous segment
      // of S ending at i-1 that can be written entirely by pen j. If S[i-1] cannot be
      // written, k=i.
      int[][] preCalc = new int[N + 1][K];
      for (int j = 0; j < K; j++) {
        preCalc[0][j] = 0;
      }

      for (int i = 1; i <= N; i++) {
        char currentCharacter = S.charAt(i - 1);

        // 1. Pre-calculate the starting point of the current continuous segment
        // (S[kStart..i-1] by pen j)
        for (int j = 0; j < K; j++) {
          if (penCapabilities[j].contains(currentCharacter)) {
            preCalc[i][j] = preCalc[i - 1][j];
          } else {
            preCalc[i][j] = i;
          }
        }

        // 2. DP calculation
        for (int j = 0; j < K; j++) { // Current pen (index j)
          int kStart = preCalc[i][j]; // Start of the current segment by pen j

          if (kStart == i) {
            continue;
          }

          // Transition 1: Continue the current segment S[kStart..i-1] with pen j
          // Requires the prefix S[0..kStart-1] to end with pen j.
          int cost_continue = dp[kStart][j];

          // Transition 2: Change pen at kStart from any other pen l (l != j) to pen j
          int cost_change = INF;
          int best_prev_pen = -1;

          for (int l = 0; l < K; l++) {
            if (l != j) {
              if (dp[kStart][l] != INF) {
                if (dp[kStart][l] + 1 < cost_change) {
                  cost_change = dp[kStart][l] + 1;
                  best_prev_pen = l;
                }
              }
            }
          }

          // Select the minimum cost and store the transition information
          if (cost_continue <= cost_change) {
            dp[i][j] = cost_continue;
            prevSegmentEnd[i][j] = kStart;
            lastPen[i][j] = j;
          } else {
            dp[i][j] = cost_change;
            prevSegmentEnd[i][j] = kStart;
            lastPen[i][j] = best_prev_pen;
          }
        }
      }

      // 3. Find the overall minimum and the ending pen
      int minChanges = INF;
      int endPen = -1;

      for (int j = 0; j < K; j++) {
        if (dp[N][j] < minChanges) {
          minChanges = dp[N][j];
          endPen = j;
        }
      }

      // 4. Backtrack to reconstruct the path (pen sequence)
      Stack<Integer> penSequence = new Stack<>();
      int currentPos = N;
      int currentPen = endPen;

      while (currentPos > 0) {
        if (currentPen == -1)
          break;

        int segmentEnd = prevSegmentEnd[currentPos][currentPen];

        // The current pen (currentPen + 1) was used from segmentEnd to currentPos - 1
        for (int p = segmentEnd; p < currentPos; p++) {
          penSequence.push(currentPen + 1); // Pen index is 1-based
        }

        // Update for the next segment
        currentPos = segmentEnd;
        currentPen = lastPen[currentPos][currentPen];
      }

      // 5. Print the result (the sequence of pens)
      StringBuilder sb = new StringBuilder();
      if (minChanges == INF) {
        sb.append("IMPOSSIBLE");
      } else {
        while (!penSequence.isEmpty()) {
          sb.append(penSequence.pop() + " ");
        }
      }
      pw.println(sb.toString());
    }

    pw.flush();
  }
}
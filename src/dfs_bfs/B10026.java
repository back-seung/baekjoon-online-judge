package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// 적록색약 R == G
public class B10026 {

    static int N;
    static char[][] graph;
    static boolean[][] visited;
    static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws Exception {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new char[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            String rgbs = br.readLine();
            for (int j = 1; j <= N; j++) {
                switch (rgbs.charAt(j - 1)) {
                    case 'R':
                        graph[i][j] = 'R';
                        break;
                    case 'G':
                        graph[i][j] = 'G';
                        break;
                    case 'B':
                        graph[i][j] = 'B';
                        break;
                }
            }
        }

//        for (int i = 0; i < N + 2; i++) {
//            for (int j = 0; j < N + 2; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (!visited[row][col]) {
                    dfs(row, col);
                    count++;
                }
            }
        }

        System.out.print(count + " "); // 색약 ㄴㄴ
        count = 0; // 카운트 초기화
        visited = new boolean[N + 2][N + 2];
        // 배열 색약용으로(G -> R) 변경
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (graph[row][col] == 'G') {
                    graph[row][col] = 'R';
                }
            }
        }

        // dfs
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (!visited[row][col]) {
                    dfs(row, col);
                    count++;
                }
            }
        }
        System.out.print(count);
    }

    static void dfs(int row, int col) {
        visited[row][col] = true;
        char temp = graph[row][col];

        for (int i = 0; i < 4; i++) {
            int newRow = row + D[i][0];
            int newCol = col + D[i][1];

            if (graph[newRow][newCol] == temp && !visited[newRow][newCol]) {
                dfs(newRow, newCol);
            }
        }

    }
}

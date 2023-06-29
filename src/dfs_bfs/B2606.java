package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바이러스
public class B2606 {

    /*입력
    첫째 줄에는 컴퓨터의 수가 주어진다.
    컴퓨터의 수는 100 이하인 양의 정수이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다.

    둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다.
    이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.*/

    static int computers, edges;

    static boolean graph[][];
    static boolean[] visit;

    static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        edges = Integer.parseInt(br.readLine());
        graph = new boolean[computers + 2][computers + 2];
        visit = new boolean[computers + 2];

        for (int i = 1; i <= edges; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            graph[x][y] = graph[y][x] = true;
        }

        for (int i = 0; i < computers + 2; i++) {
            for (int j = 0; j < computers + 2; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        count = 0;
        dfs(1);
        System.out.println(count);
    }

    static void dfs(int v) {
        visit[v] = true;

        for (int i = 1; i <= computers; i++) {
            if (graph[v][i] && !visit[i]) {
                dfs(i);
                count++;
            }
        }
    }
}

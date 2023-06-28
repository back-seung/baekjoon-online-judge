package dfs_bfs;import com.sun.org.apache.xpath.internal.functions.FuncFalse;import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.*;public class B2667 {    static boolean[][] graph;    static int N;    static int count;    static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};    public static void main(String[] args) throws Exception {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        N = Integer.parseInt(st.nextToken());        graph = new boolean[N + 2][N + 2];        List<Integer> list = new ArrayList<>();        for (int i = 1; i <= N; i++) {            String num = br.readLine();            if (num.length() == 1) {                continue;            }            for (int j = 1; j <= N; j++) {                graph[i][j] = num.charAt(j - 1) == '1';            }        }        for (int i = 1; i <= N; i++) {            for (int j = 1; j <= N; j++) {                if (graph[i][j]) {                    count = 1;                    bfs(i, j);                    list.add(count);                }            }        }        System.out.println(list.size());        for (int i = 0; i < list.size(); i++) {            System.out.print(list.get(i) + ", ");        }    }    static void dfs(int row, int col) {        graph[row][col] = false;        count++;        for (int i = 0; i < 4; i++) {            int nRow = row + D[i][0];            int nCol = col + D[i][1];            if (graph[nRow][nCol]) {                dfs(nRow, nCol);            }        }    }    static void bfs(int row, int col) {        Queue<int[]> q = new LinkedList<>();        q.add(new int[]{row, col});        while (!q.isEmpty()) {            int[] arr = q.poll();            row = arr[0];            col = arr[1];            graph[row][col] = false;            for (int i = 0; i < 4; i++) {                int newRow = row + D[i][0];                int newCol = col + D[i][1];                if (graph[newRow][newCol]) {                    graph[newRow][newCol] = false;                    q.add(new int[]{newRow, newCol});                    count++;                }            }        }    }}
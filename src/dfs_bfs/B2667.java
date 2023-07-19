package dfs_bfs;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*;public class B2667 {    // 가로,세로 (정사각형)    static int N;    // 지도    static boolean[][] map;    // 상, 하, 좌, 우    static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};    static int count;    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        List<Integer> list = new ArrayList<>();        N = Integer.parseInt(br.readLine());        map = new boolean[N + 2][N + 2];        for (int i = 1; i <= N; i++) {            String line = br.readLine();            for (int j = 1; j <= N; j++) {                map[i][j] = line.charAt(j - 1) == '1';            }        }        for (int i = 1; i <= N; i++) {            for (int j = 1; j <= N; j++) {                if (map[i][j]) {                    count = 1;                    BFS(i, j);                    list.add(count);                }            }        }        System.out.println(list.size());        Collections.sort(list);        for (int i = 0; i < list.size(); i++) {            System.out.println(list.get(i));        }    }    public static void BFS(int row, int col) {        Queue<int[]> queue = new LinkedList<>();        map[row][col] = false;        queue.add(new int[]{row, col});        while (!queue.isEmpty()) {            int[] rc = queue.poll();            row = rc[0];            col = rc[1];            for (int i = 0; i < 4; i++) {                int newRow = row + D[i][0];                int newCol = col + D[i][1];                if (map[newRow][newCol]) {                    queue.add(new int[]{newRow, newCol});                    map[newRow][newCol] = false;                    count++;                }            }        }    }}
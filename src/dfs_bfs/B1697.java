package dfs_bfs;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.LinkedList;import java.util.Queue;import java.util.StringTokenizer;public class B1697 {    static int N, K;    static int[] map = new int[100001];    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        N = Integer.parseInt(st.nextToken());        K = Integer.parseInt(st.nextToken());        if (N == K) {            System.out.println(0);        } else {            BFS(N);        }    }    public static void BFS(int N) {        Queue<Integer> queue = new LinkedList<>();        queue.add(N);        map[N] = 1;        while (!queue.isEmpty()) {            int cur = queue.poll();            if (cur == K) {                System.out.println(map[cur] - 1);            }            for (int i = 0; i < 3; i++) {                int temp = cur;                switch (i) {                    case 0:                        temp -= 1;                        break;                    case 1:                        temp += 1;                        break;                    case 2:                        temp *= 2;                        break;                }                if (temp >= 0 && temp < map.length && map[temp] == 0) {                    map[temp] = map[cur] + 1;                    queue.add(temp);                }            }        }    }}
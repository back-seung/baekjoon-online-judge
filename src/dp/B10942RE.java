package dp;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Stack;import java.util.StringTokenizer;// 시간 초과public class B10942RE {    /*    1. 테이블 정의        홍준이가 질문한 S,E 범위의 수가 팰린드롬인지 판별    2. 점화식    3. 초기값    */    static StringTokenizer st;    static int S, E;    static int[][] DP;    static int[] arr;    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringBuilder sb = new StringBuilder();        // 수열 크기        int N = Integer.parseInt(br.readLine());        arr = new int[N + 1];        DP = new int[N + 1][N + 1];        // 칠판에 적은 수        st = new StringTokenizer(br.readLine());        for (int i = 1; i < arr.length; i++) {            arr[i] = Integer.parseInt(st.nextToken());        }        // 홍준이 질문           int M = Integer.parseInt(br.readLine());        for (int i = 0; i < M; i++) {            st = new StringTokenizer(br.readLine());            S = Integer.parseInt(st.nextToken());            E = Integer.parseInt(st.nextToken());            boolean flag = check(S, E) == 1 ? true : false;            if (flag) {                sb.append("1\n");            } else {                sb.append("0\n");            }        }        System.out.println(sb);    }    // S,E 범위 1개인 경우 -> 어떤 값이든 팰린드롬이다.    // S,E 범위 2개인 경우 -> 서로 값이 같으면 팰린드롬이다.    // S,E 범위 3개 이상인 경우 -> 서로 값이 같다면, S + 1, E - 1을 계속해서 검증한다.    static int check(int S, int E) {        if (S >= E) return 1;        if (DP[S][E] != 0) return DP[S][E];        if (arr[S] == arr[E]) return DP[S][E] = check(S + 1, E - 1);        return 0;    }}
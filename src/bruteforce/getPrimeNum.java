package bruteforce;import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.StringTokenizer;public class getPrimeNum {    public static void main(String[] args) throws Exception {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine(), "");        int N = Integer.parseInt(st.nextToken());        int count = 0;        for (int i = 2; i <= N; i++) {            if (i % 2 == 0) {                continue;            }            if (isPrime(i)) {                count++;            }            System.out.println("count = " + count);        }    }    public static boolean isPrime(int N) { // 1 ~ 10까지        int count = 0;        for (int i = 2; i <= N; i++) {            if (N % i == 0) {                count++;            }        }        if (count > 1) {            return false;        }        return true;    }}
package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        // 동전 종류
        int N = Integer.parseInt(arr[0]);
        // 종류를 담을 배열
        int[] moneys = new int[N];
        // 총합
        int K = Integer.parseInt(arr[1]);

        // 동전 종류 배열 초기화 : 오름차순
        for (int i = 0; i < moneys.length; i++) {
            moneys[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int target = moneys.length - 1;
        while (K > 0) {
            if (K < moneys[target]) {
                target--;
                continue;
            }
            K -= moneys[target];
            count++;
        }
        System.out.println(count);
    }
}

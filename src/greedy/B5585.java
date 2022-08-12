package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5585 {

    public static void main(String[] args) throws Exception {
        final int TOTAL = 1000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        final int COST = Integer.parseInt(st.nextToken());

        int count = 0;
        int CHANGE = TOTAL - COST;
        count += CHANGE / 500;
        CHANGE = CHANGE % 500;
        count += CHANGE / 100;
        CHANGE = CHANGE % 100;
        count += CHANGE / 50;
        CHANGE = CHANGE % 50;
        count += CHANGE / 10;
        CHANGE = CHANGE % 10;
        count += CHANGE / 5;
        CHANGE = CHANGE % 5;
        count += CHANGE / 1;
        CHANGE = CHANGE % 1;

        System.out.println(count);
    }
}

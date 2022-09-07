package problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Caesar {
    public static void main(String[] args) throws Exception {
        final int MIN = 65;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] - 3);

            if ((int) arr[i] < MIN) {
                arr[i] = (char) (arr[i] + 26);
            }
            System.out.print(arr[i]);
        }
    }
}

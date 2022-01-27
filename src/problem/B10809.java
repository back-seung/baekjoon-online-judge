package problem;

import java.util.Scanner;

public class B10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int[] answer = new int[26];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {

            char ch = S.charAt(i);

            if (answer[ch - 'a'] == -1) {
                answer[ch - 'a'] = i;
            }
        }

        for (int i : answer) {
            System.out.print(i + ",");
        }
    }
}

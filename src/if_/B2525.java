package if_;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HOUR_LIMIT = 23;
        String firstInput = sc.nextLine(); // 14 30
        String lastInput = sc.nextLine(); // 20

        String[] arr = firstInput.split(" ");

        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int addMin = Integer.parseInt(lastInput);


        System.out.println(hour + "" + min + "" + addMin);
    }
}

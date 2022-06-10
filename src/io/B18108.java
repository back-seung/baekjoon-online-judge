package io;

import java.util.Scanner;

public class B18108 {
    public static void main(String[] args) {
        final int BUDDA_YEAR = 543;

        Scanner scanner = new Scanner(System.in);

        Integer input = scanner.nextInt();

        if (input > 1000 && 3000 >= input) {
            input = input - BUDDA_YEAR;
        }
        System.out.println(input);

    }
}

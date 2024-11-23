package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bài 2:
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        int x = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}

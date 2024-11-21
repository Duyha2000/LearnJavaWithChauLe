package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 1
        int b = scanner.nextInt(); // 10
        int x = scanner.nextInt();// 2
        int count = 0;

        while (a < b) {
            if (a % x == 0) {
                count++;
            }
            // steps:
            a++;
        }
        System.out.println(count);
        // int n = scanner.nextInt();// 10
        // int i = 1;
        // int sum = 0;
        // // 1 ->
        // while (i <= n) {
        // sum += i;

        // // steps:
        // i++;

        // }
        // System.out.println(sum);
        // for: from - to (range) (from 1 - to 5) (80%)
        // while (lặp khi):
        // in ra các số từ 1 đến 5
        // int a = 1; // start
        // while (a <= 5 - condition) {
        // System.out.println(a);
        // // steps: a++ a--
        // a++;
        // }

        // Input a, b -> "in ra" các số chia hết cho 3 và 5 trong khoảng [a,b]
        // a = 1 b = 50 -> 15 30 45
        // int a = scanner.nextInt(); // 1
        // int b = scanner.nextInt(); // 50
        // while (a <= b) {
        // if (a % 3 == 0 && a % 5 == 0) {
        // System.out.println(a);
        // }
        // // steps:
        // a++;
        // }
    }
}
/*
 * Bài tập 1:
 * int n = scanner.nextInt(); // 90
 * 
 * if (n <= 100) {
 * for (int i = n; i <= 100; i++) {
 * if (i % 2 == 0) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * 
 * Bài tập 2:
 * // int factorial = 1; // store
 * // factorial?
 * // n = 5 -> 5! = 5 * 4 * 3 * 2 * 1 = 120
 * // n = 7 -> 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
 * // int a = 3;
 * // a++;
 * // a = a + 1;
 * // a += 1;
 * // a *= 2; -> a = a * 2;
 * // System.out.println(a); // a = 6 (chỉ dùng *)
 * 
 * // i from 5 to 1 (nhân các i vào với nhau)
 * // n 2 1 -> vòng for này cho i (sinh ra vòng for để làm gì)
 * // for (int i = n; i >= 1; i--) {
 * // factorial = factorial * i; // factorial = 5 * 4
 * // }
 * // System.out.print(factorial);
 * // input n. Tính sum các số từ 1 đến n? 1 - > 5 (1 + 2 + 3+4+5)
 * // int n = scanner.nextInt();
 * // int sum = 0;
 * // mutiply = 1 -> mutiply *=...
 * // sum = 0 -> sum += ...
 * // for (int i = 1; i <= n; i++) {
 * // sum = sum + i; // sum = 0 + 1 = 1
 * // // sum = 1 + 2 = 3
 * // // sum = 3 + 3 = 6
 * // // sum = 6 + 4 = 10
 * // // sum = 10 + 5 = 15
 * // }
 * 
 * // System.out.println(sum);
 * Bài 4: int a = scanner.nextInt(); // 1
 * int b = scanner.nextInt(); // 50
 * // 1 - > 50 (check)
 * for (int i = a; i <= b; i++) {
 * if (i % 3 == 0 && i % 5 == 0) {
 * System.out.println(i);
 * }
 * }
 * Bài tập 5: // int n = scanner.nextInt(); // 10
 * // i: 1 ->10
 * 
 * // int count = 0;
 * // for (int i = 1; i <= n; i++) {
 * // if (n % i == 0) {
 * // count++;
 * // }
 * // }
 * // System.out.println(count);
 * 
 * // 12 : (1-12)
 * // Count: 12 6 4 3 2 1 ( count = 6)
 * // n = 10 -> 1 2 5 10 (count = 4)
 * // Check các số from 1 to 10 -> 10 : số nào thì count tăng lên giá trị là 1
 * 
 * Bài tập:
 * int a = scanner.nextInt(); // a = 1
 * int b = scanner.nextInt(); // b = 50
 * int x = scanner.nextInt(); // x = 5
 * int count = 0;
 * // i: 1 - > 50 (check)
 * for (int i = a; i <= b; i++) {
 * if (i % x == 0) {
 * count++;
 * }
 * }
 * System.out.println(count);
 * Bài tập :
 * int y = scanner.nextInt();
 * 
 * for (int i = 1; i <= 100; i++) {
 * if (i % y != 0) {
 * System.out.println(i);
 * } else if (i % y == 0) {
 * break;
 * }
 * 
 * // Từ 7 bỏ đi các giá trị đằng sau (break)
 * }
 * // int k = scanner.nextInt(); // 10
 * // int sum = 0;
 * // i: 1 -> 10 (check số chẵn -> tính tổng )
 * // B1: trc hết phải là số chẵn (even number)
 * // B2: tính vào tổng
 * // for (int i = 1; i <= k; i++) {
 * // if (i % 2 == 0) {
 * // sum = sum + i; // 2 4 6 8 10
 * // }
 * // }
 * // System.out.println(sum);
 * 
 * // a = 2 b = 3 -> 2 * 2 * 2 = 8
 * // int a = scanner.nextInt(); // 2
 * // int b = scanner.nextInt(); // 3
 * // int multiple = 1;
 * // a = 3 b = 4 -> 3 * 3 * 3 * 3 =...
 * 
 * // for (int i = 1; i <= b; i++) {
 * // multiple *= a;
 * // }
 * 
 * // System.out.println(multiple);
 */
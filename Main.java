import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int dayOfWeek = scanner.nextInt();
        int minutes = scanner.nextInt();
        switch (dayOfWeek) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                if (minutes <= 180) {
                    System.out.println(" Free ");
                } else if (minutes <= 290) {
                    System.out.println(" $4 ");
                } else if (minutes <= 269) {
                    System.out.println(" $11 ");
                } else if (minutes <= 299) {
                    System.out.println(" $16 ");
                } else if (minutes <= 329) {
                    System.out.println(" $22 ");
                } else if (minutes <= 369) {
                    System.out.println(" $30 ");
                } else {
                    System.out.println(" $40 ");
                }
                break;
            case 5:
            case 6:
                System.out.println((minutes / 30) * 4 + 4);
                // minutes = 40 -> (40 /30 ) * 4 + 4 = 1 * 4 + 4 =8
                // 0 to 29 minutes: $4
                // 35 minutes: 1 * 4 + 4 = 8
                // 50 minutes: 1 * 4 + 4 = 8
                // 75 minutes: 2 * 4 + 4 = 12
                break;
            default:
                System.out.println("Nhập đúng");
        }
        // 3 tiếng * 2

    }
}

// Input: categories, quantities
// categories(A,B,C,D) -> switch case
// A,B,C: if,else if , else
// D: quantities = 30 -> discounts = 30, quantities = 60 -> discounts = 50
// Output: discounts
// char categories = scanner.nextLine().charAt(0);
// int quantities = scanner.nextInt();
// switch (categories) {
// // For all categories except D, the following rules exist
// case 'A':
// case 'B':
// case 'C':
// if (quantities <= 2) {
// System.out.println("no discount");
// } else if (quantities <= 5) {
// System.out.println("15% discount");
// } else if (quantities <= 10) {
// System.out.println("25% discount");
// } else {
// System.out.println("30% discount");
// }
// break;
// case 'D':
// // 0 -2
// if (quantities >= 50) {
// System.out.println("50% discount");
// } else if (quantities <= 0) {
// System.out.println("No discount, no item");

// } else {
// System.out.println(quantities + " 1% discount for every item ");
// }
// break;
// default:
// System.out.println("Nhập A B C D ");
// }
// // check khoa hoc nao
// String PG = scanner.nextLine();
// // chck credit
// int credit = scanner.nextInt();
// if (PG.equalsIgnoreCase("UG") && credit >= 72) {
// System.out.println("The student is eligible to graduate.");
// } else if (PG.equalsIgnoreCase("UG(Hons)") && credit >= 96) {
// System.out.println(" Enrolled in honors couresUG");
// } else if (PG.equalsIgnoreCase("PO") && credit >= 48) {
// System.out.println("Enrolled in postgraduate program");
// } else {
// System.out.println("học dốt");
// }
// Exercise 4:
// Determine if a given year is a leap year.
// Output: Print "Year year is a leap year!" or "Year year is not a leap year!"
// based on the rules:
// Divisible by 4 but not by 100, or divisible by 400. Example:
// Input: 2000 Output: "Year 2000 is a leap year!"
// Input: 1999 Output: "Year 1999 is not a leap year!"
// int year = scanner.nextInt();

// && ||
// Anh cao 1m7 VÀ em cao 1m6
// Anh cao 1m7 hoặc em cao 1m3
// anh hoặc em cao trên 1m5

// if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
// System.out.println(year + " is a leap year!");
// } else {
// System.out.println(year + " is not a leap year!");
// }
// Input a number -> check xem số chẵn hay lẻ

// even: 2 4 6 8 10 or odd number: 3 5 7 9 11
// 6 : 2 = 3 dư 0
// 8 : 2 = 4 dư 0
// int num = scanner.nextInt();
// if (num % 2 == 0)
// System.out.println("Even number");
// else
// System.out.println("Odd number");
// Evaluate an arithmetic expression based on two integers a, b, and c character
// operator c (+, -, *, /).

// Example:
// Input: a = 7, c = '+', b = 9 -> Output: 16
// nextInt, nextDouble cho phép input nhưng không cho tạo line mới để input
// int a = Integer.parseInt(scanner.nextLine());
// char c = scanner.nextLine().charAt(0);
// int b = Integer.parseInt(scanner.nextLine()); // line 121 122
// if - else if - else
/*
 * Problem Description:
 * Write a program that takes an integer score (ranging from 0 to 100) as input
 * and classifies it as follows:
 * 
 * <= 50: "Weak"
 * 51 <= score <= 60: "Average"
 * 61 <= score <= 75: "Good"
 * 76 <= score <= 90: "Very Good"
 * 91 <= score <= 100: "Excellent"
 * Example:
 * For a score of 65, the output will be "Good".
 * For a score of 45, the output will be "Weak".
 * Requirements:
 * Input an integer score (0–100).
 * Output the corresponding grade classification.
 */
// // switch(thay đổi)
// // case: các trường hợp xảy ra
// // Nhập vào 1 ngày và check xem ngày thứ mấy trong tuần:
// // ví dụ: input day = 2 -> Monday
// // input day = 3 -> Tuesday
// int day = scanner.nextInt();
// // for: break ->
// switch (day) {
// case 2:
// System.out.println("Monday");
// break; // thoát cặp {}
// case 3:
// System.out.println("Tuesday");
// break;
// default:
// System.out.println("Invalid");
// }

// 50 <= score <= 60 -> ko dùng đc switch case
// giá trị cụ thể
// đèn đỏ -> dừng lại, xanh -> đi tiếp, vàng

// switch (c) {
// case'+':System.out.println(a+b);break;case'-':System.out.println(a-b);break;case'*':System.out.println(a*b);break;case'/':System.out.println(a/b);break;default:System.out.println("Fail");break;
// }

// Giả sử có nhiều condition:
// if - là điều kiện đầu
// else if cho các mệnh đề ở giữa
// else cho mệnh đề cuối
// if (score <= 50) {
// System.out.println("Weak");
// } else if (score <= 60) {
// System.out.println("Average");
// } else if (score <= 75) {
// System.out.println("Good");
// } else if (score <= 90) {
// System.out.println("Very Good");
// } else if (score <= 100) {
// System.out.println("Excellent");
// } else {
// System.out.println("false");
// }
// Comparison Operators:
// > >= < <= equal(==)
// 3 == 3
// int a = 3;
// int b = 5; // b giá trị = 5
// Comparison: không được dùng 1 = -> if else
// System.out.println(a == b); // false
// boolean z = a > b;
// System.out.println(z); // false
// Not equal to: !=

// if(boolean expression){} else{}
// Input 1 number và kiểm tra số đó >0 hay không, có in ra yes, < in ra no
// int number = scanner.nextInt();
// if (number > 0) {
// System.out.println("yes");
// } else {
// System.out.println("no");
// }
// Variables and Data Types:
// Primitive Types: int, double, float,char, boolean
// int: -3 , -4
// 2.55555555555555555555555
// double: 2.5, 0.5
// float: 2.555f (không dùng)
// char: 'h','e','l','o'
// String (Object): "hello"
// Scanner: input

// Output:
// System.out.println("Hello"); // line: xuống dòng mới
// System.out.print("Hello"); // nối liền trên cùng 1 dòng
// // Input: a = 5 và print ra console
// Scanner scanner = new Scanner(System.in);
// int a = scanner.nextInt(); // input cho int
// System.out.println("Giá trị " + a);
// // double, string, char

// double b = scanner.nextDouble();
// // sout -> tab
// System.out.println(" Gia tri " + b);

// String hello = scanner.nextLine(); // String có thể dùng sc.next() hoặc
// sc.nextLine()
// System.out.print(hello);
// // String = "Xin chào" -> ký tự đầu tiền index = 0
// // array : index = 0
// // char: charAt: tại ký tự thứ
// char x = scanner.nextLine().charAt(0);
// // boolean true/false
// boolean hello1 = scanner.nextBoolean();

// 3. Expressions and Assignment Statements

// + - * / %
// int a = 5; // a <- 5
// int b = 3;
// System.out.println(a + b); // 8
// 5 : 3 = 1 mod 2
// 5 - 1 * 3 = 2
// 12 : 7 = 1 mod 5
// 12 - 1 * 7 = 5
// 25 : 9 = 2 mod 7
// / int
// % dư
// System.out.println(a / b); // 1
// System.out.println(a % b); // 2
// a++; // a = 6 -> a+=1
// a -= 2; // a = a - 2 (4)
// a++ a+=2
// a /= 2;
// for (int i = 0; i <= 5; i = i + 1) {
// System.out.print(i + " ");
// }
// System.out.println(a);
// System.out.println(a * b); // a = 5 b = 3
// a++; // a = 6
// System.out.println(a * b);
// System.out.println(a / b); // lấy số nguyên
// b++;
// System.out.println(a + b);
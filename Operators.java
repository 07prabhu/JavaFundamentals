//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("input the two numbers");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("choose the operation to perform : +, -, *, / ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(n1 + n2);
        } else if (operator == '-') {
            System.out.println(n1 - n2);
        } else if (operator == '*') {
            System.out.println(n1 * n2);
        } else if (operator == '/') {
            System.out.println(n1 / n2);

        } else {
            System.out.println("choose the correct option");
        }

    }

}

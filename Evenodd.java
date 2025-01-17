//Write a program to print whether a number is even or odd, also take input from the user

import java.util.*;

public class Evenodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("the number you entered is even");
        } else {
            System.out.println("the number is odd!");
        }

    }
}

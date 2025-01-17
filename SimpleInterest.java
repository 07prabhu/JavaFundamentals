//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THE SIMPLE INTEREST CALCULATOR");
        System.out.println("enter your principle Amount");
        float p = sc.nextInt();
        System.out.println("Rate of interest");
        float r = sc.nextInt();
        System.out.println("enter the time period");
        float t = sc.nextInt();
        float SI = p * r * t / 100;
        System.out.println("the simple intrest is: " + SI);

    }

}

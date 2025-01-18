//To calculate Fibonacci Series up to n numbers 0 1 1 2 3 5 8 13 21........n

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers u want");
        int count = sc.nextInt();
        long n1 = 0;
        long n2 = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(n1 + " ");

            long nextterm = n1 + n2;
            n1 = n2;
            n2 = nextterm;

        }

    }

}

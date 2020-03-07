package sjsu.edu;

import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        System.out.println("Fibonacci Sequence = " + fibonacciSequence(number));

    }
    public static int fibonacciSequence (int initialNumber){
    int fibonancciResult = 0;
        for (int i= initialNumber - 1; i > 0; i--){
            fibonancciResult += i;
        }
        return fibonancciResult;
    }
}

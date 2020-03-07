/*
(Use the Random class). Write a program that creates a Random object with seed 1000 and displays
the first 50 random integers between 0 and 100 using the nextInt(100) method
 */
package sjsu.edu;

import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {
        Random generator =  new Random(1000);

        for (int i=0;i < 50; i++) {
            int numberGenerator = generator.nextInt(100);

            System.out.println("Random number: " + numberGenerator);
        }
    }

}
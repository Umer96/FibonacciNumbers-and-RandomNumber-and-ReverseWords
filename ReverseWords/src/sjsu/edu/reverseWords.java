package sjsu.edu;

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String words = in.nextLine();

        System.out.println("Reversed string: " + reverseString(words));
    }

    public static String reverseString (String realWord){
        String reverseString = "";
        for (int i = realWord.length() - 1; i >= 0 ; i--){
            reverseString += realWord.charAt(i) + ""; //char to strings
        }
        return reverseString;
    }
}

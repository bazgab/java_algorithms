package com.bazgab;

import java.lang.StringBuilder;

public class CheckIfPalindrome {

    // In this example we need to check if a word is a palindrome, that is, if it was written backwards it would
    // result in the same word.
    // e.g.: Madam -> reversed -> Madam

    // The first approach we can take is by using the StringBuilder from java.lang with the .reverse() method.
    public static boolean isPalindrome(String s) {

        String reversed = new StringBuilder(s).reverse().toString();

        if (reversed.equals(s)) {
            return true;
        }
        return false;
    }

    // The second approach we can take is by converting the string to a character array and manipulating it
    // through a while loop to return to us the reversed String
    public static String isPalindromeWithoutStringBuilder(String s) {

        char[] StringToCharArray = s.toCharArray();
        int beginning = 0;
        int ending = StringToCharArray.length - 1;
        char temporaryCharacter;
        // While the ending is bigger than the beginning, means that we take will loop through this from the edges
        // until the center character
        while (ending > beginning) {
            // The temporary character serves as a placeholder while we loop from ending to beginning
            temporaryCharacter = StringToCharArray[beginning];
            StringToCharArray[beginning] = StringToCharArray[ending];
            StringToCharArray[ending] = temporaryCharacter;
            // Here we will move one character less from the ending, and one more from the beginning to loop again
            ending--;
            beginning++;
        }
        // We return a string with the reversed Character which we will then compare in the main method using the
        // .equals() method
        return new String(StringToCharArray);

    }


    public static void main(String[] args) {

        String s = "madam";
        System.out.println(isPalindrome(s));
        System.out.println(s.length());
        System.out.println(isPalindromeWithoutStringBuilder(s));
        if (isPalindromeWithoutStringBuilder(s).equals(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}

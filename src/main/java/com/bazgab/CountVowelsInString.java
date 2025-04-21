package com.bazgab;

public class CountVowelsInString {

    // We will create a method that returns an Integer (the count number) and take in the String to be counted.
    public static Integer VowelCounter(String s) {
        // Firstly we convert the String to a character array
        char[] StringToCharArray = s.toCharArray();
        // Start the count at zero
        int count = 0;
        // Loop for a given character c in the character Array
        for (char c : StringToCharArray) {
            // If the character is a vowel, we count it.
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }

        }
        // Returning the count since our method returns an Integer
        return count;

    }


    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(VowelCounter(s));

    }
}

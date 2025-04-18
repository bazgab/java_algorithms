package com.bazgab;

public class LexographicallySmallestString {

    public static void main(String[] args) {
        // Start with the string that is to be changed.
        String s = "hackerrank";
        // Turn into a Character Array because we will need to control each character individually
        char[] charArray = s.toCharArray(); // Important to use the .toCharArray() method
        // Printing it once just to make sure
        System.out.println(charArray);
        // Declaring variables
        int i;
        // Start the control group as modified == false
        boolean modified = false;
        // First loop through the length of the charArray
        for (i = 0; i < charArray.length; i++) {
            /* Setting the character to a.
               This will begin our loop with the first letter
               If the character is modified, we will have a break
               because the problem asked to go through the process
               exactly once.
             */
            if (charArray[i] == 'a') {

                if (modified) {
                    break;
                }
            }
            // Now iterating in case modified is true
            modified = true;
            // If it is true, we want the previous letter, for which we will use
            // the (char) (char - 1) method to get the previous answer.
            charArray[i] = (char) (charArray[i] - 1);
        }
        // Finally we print the output after the loop.
        System.out.println(charArray);



    }




}




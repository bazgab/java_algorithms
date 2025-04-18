package com.bazgab;

public class MaximumSubarraySum {

    /*
    In this problem we have to find the maximum sum of a given subarray within the array.

    Let's say we have an array arr[] = {1, 2, 3, -2}
    To find the maximum sum of any given subarray we have to iterate over the numbers until
    we get the highest possible sum. For example:
    subarray1[] = {1, 2, 3} -> 1 + 2 + 3 = 6
    subarray2[] = {2, 3, -2} -> 2 + 3 - 2 = 3
    subarray3[] = {2, 3} -> 2 + 3 = 5
    ... and so on

    */

    static int maxSubarraySum(int[] arr) {
        /*
        We will solve this by implementing Kadane's Algorithm, firstly we need to declare
        two variables, answer (for the actual answer) and maxUntilIndex (a temporary variable
        that will keep track of the result, both starting at the 0 index.
        */
        int answer = arr[0];
        int maxUntilIndex = arr[0];

        int i;
        //Here we will create a simple for loop to go through the array length
        for (i = 1; i < arr.length; i++) {
            // Utilizing the Math library we will use the max method to find the largest number between the two
            // since our maxUntilIndex start at arr[0], we will add the number the loop is going through (arr[i])
            // and check if it's larger or smaller than the number itself (arr[i])
            // Example: let's say arr[0] is 2 and arr[1] is 1
            // arr[0] + arr[1] = 3, so maxUntilIndex = 3
            // At this point answer is arr[0], which is equal to 2, therefore answer also becomes 3. And so on...
            maxUntilIndex = Math.max(maxUntilIndex + arr[i], arr[i]);
            answer = Math.max(answer, maxUntilIndex);
        }
        return answer;
    }

    public static void main(String[] args) {
    int[] arr = {1, 2, 3, -2};
    System.out.println(maxSubarraySum(arr));
    }


}

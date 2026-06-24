/**
 * Problem: Find the maximum element in an array.
 *
 * Approach: Walk through every element once, keeping track of the largest
 * value seen so far.
 *
 * Time Complexity:  O(n) - we look at each element once
 * Space Complexity: O(1) - only one extra variable
 */
public class FindMax {

    // Returns the largest value in the array.
    static int findMax(int[] arr) {
        // Start by assuming the first element is the max.
        int max = arr[0];

        // Compare every other element against our current max.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 2, 9, 4, 1};

        System.out.println("Array: [3, 7, 2, 9, 4, 1]");
        System.out.println("Maximum element: " + findMax(nums)); // Expected: 9
    }
}

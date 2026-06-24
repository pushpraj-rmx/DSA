/**
 * Your very first DSA program.
 *
 * Goal: create an array, then look at its boxes one at a time.
 * Run it, read the output, and match each printed line to the code.
 */
public class HelloArray {

    public static void main(String[] args) {
        // 1. Create an array of 5 numbers.
        //    The boxes are numbered 0, 1, 2, 3, 4.
        int[] nums = {3, 7, 2, 9, 4};

        // 2. Grab one box directly by its index (instant - O(1)).
        System.out.println("The box at index 0 holds: " + nums[0]); // 3
        System.out.println("The box at index 3 holds: " + nums[3]); // 9

        // 3. How many boxes are there? Use .length (a field, no parentheses).
        System.out.println("Total boxes: " + nums.length);          // 5

        // 4. Walk through every box, one at a time (this is O(n)).
        System.out.println("Walking through the whole array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("  index " + i + " -> " + nums[i]);
        }
    }
}

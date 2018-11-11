package tech.bts.precourses.exercises;

import java.util.*;

/**
 * Loop exercises (while, for)
 */
public class LoopExercises {

    public static void main(String[] args) {

        // NOTE:
        // If you want to make it a bit more difficult,
        // solve each exercise with a function that returns a value or a list of values.
        // Also add tests for them. See the following function:
        performTests();


        // 1. Write a loop that prints the numbers from 1 to 5

        int num = 1;

        while(num <= 5){
            System.out.println(num);
            num++;
        }

        // 2. Write a loop that prints the numbers from `start` to `end`
        int start = 0;
        int end = 7;

        while (end >= start) {
            System.out.println(start);
            start++;
        }

        // 3. Write a loop that prints the even numbers from 1 to 10 (i.e. 2, 4, 6, 8, 10)

        int num2 = 1;

        while (num2 <= 10){
            if (num2 % 2 == 0){
                System.out.println(num2);
            }
         num2++;
        }

        // 4. Write a loop that prints the odd numbers from 1 to 10 (i.e. 1, 3, 5, 7, 9)

        int oddNum = 1;

        while (oddNum <= 10){
            if (oddNum % 2 == 1){
                System.out.println(oddNum);
            }
            oddNum++;
        }


        // 6. Write a loop that calculates the sum of the even numbers from 1 to 10 (i.e. 2 + 4 + ... + 10 )

        int num3 = 0;

        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                num3 = num3 + i;
            }
        }
        System.out.println(num3);



        // 7. Using a loop, calculate the power of 2^20 (i.e 2 * 2 * 2 * ... * 2, 20 times)

        int num4 = 2;
        int counter = 1;
        int fix = 2;

        while (counter < 20){
            num4 *= fix;
            counter++;
        }
        System.out.println(num4);



        // 8. Calculate the factorial of 10 (ie. 1 * 2 * 3 * 4 * ... * 10)
        //    https://en.wikipedia.org/wiki/Factorial

        int num8 = 1;
        int fact = 2;

        while (fact <= 10){
            num8 *= fact;
            fact++;
        }
        System.out.println(num8);



        // 9. Loop from 1 to 100 and print only the numbers that are multiple of 5.
        //    You can use the `remainder` operator: if n % 5 == 0 it means that n is multiple of 5.

        for (int t = 1; t <= 100; t++){
            if (t % 5 == 0) {
                System.out.println(t);
            }
        }

        //    More difficult: don't use the `remainder` operator.

        for (int num9 = 1; num9 <= 100; num9++){
                if (5*(num9/5) == num9){
                    System.out.println(num9);
                }
        }


        // 10. Calculate the 10th fibonacci number
        //     The first fibonacci number is 0
        //     The second fibonacci number is 1
        //     From the third fibonacci number, it is calculated by adding the previous 2 numbers.
        //     So the third is 0+1=1, the fourth is 1+1=2, the fifth is 1+2=3, the sixth is 2+3=5, and so on.
        //     https://en.wikipedia.org/wiki/Fibonacci_number

        int x = 0;
        int y = 1;
        int fib = 0;

        for (int z = 0; z <= 8; z++){
            fib = x + y;
            x = y;
            y = fib;
            }
            System.out.println(fib);
    }





    // ----- Advanced ----- //


    /**
     * 2. Write a loop that prints the numbers from `start` to `end`
     *
     * Note:
     * This exercise is already solved with a function.
     * Instead of printing the numbers, we return a list of those numbers.
     */

    private static List<Integer> numbersFromStartToEnd(int start, int end) {

        List<Integer> result = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            result.add(i);
        }

        return result;
    }


    /** Performs the tests for the functions */
    private static void performTests() {

        assertEquals( numbersFromStartToEnd(1, 5), Arrays.asList(1, 2, 3, 4, 5) );
        assertEquals( numbersFromStartToEnd(-3, 2), Arrays.asList(-3, -2, -1, 0, 1, 2) );

    }

    // ---------------

    /**
     * Checks that the two values are equal and throws an error if not
     */
    private static void assertEquals(Object actual, Object expected) {

        if (!actual.equals(expected)) {
            throw new RuntimeException(
                    "Values are not equal!" + "\n"
                            + "Actual: " + actual + "\n"
                            + "Expected: " + expected + "\n"
            );
        }
    }
}
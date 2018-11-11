package tech.bts.precourses.exercises;

import java.util.*;

/**
 *  List and loop exercises
 */
public class ListExercises {

    public static void main(String[] args) {

        // You can work with this list
        List<Integer> numbers = Arrays.asList( 4, 14, 2, 7, 3, 5, 7 );

        // If you want to make it a bit more difficult,
        // create a list by reading the values from the keyboard.


        // For the exercises, suppose that you
        // don't know the numbers in the list.
        // In other words, if you change the numbers
        // the exercises should still be right.
        // Look at the list only to check the answers.

        // Note: I'll say "position" or "index", meaning
        //       one of the available positions/places
        //       of the list (0, 1, 2, etc.)



        // 1 - Display the the 3rd element in the list (remember that indexes start at 0)
        int value = numbers.get(2); // Example of how to get the first element

        System.out.println("The 3rd element is "+ value);

        // 1 - Display the last index of the list (it's not exactly the size)

        int last = numbers.size() - 1;

        System.out.println("last index is " + last);

        // 3 - Calculate the sum of the first and the last element (just 2 numbers)

        int sum = (numbers.get(0) + numbers.get(numbers.size() - 1));

        // 4 - Display all the numbers (you need an index variable for the loop)

        for (int index = 0; index <= (numbers.size() - 1); index++){
            System.out.println(numbers.get(index));
        }

        // 5 - Display just the numbers at even positions: 14, 7, 5

        for (int even = 0; even <= (numbers.size() -1); even++) {
            if (even % 2 == 1) {
                System.out.println(numbers.get(even) + " has an even position");
            }
        }

        // 6 - Calculate the sum of all numbers

        int AllSum = 0;

        for (int i = 0; i <= (numbers.size() - 1); i++){
            AllSum += numbers.get(i);
        }

        // 7 - Calculate the sum of the numbers at odd positions: 4, 2, 3, 7

        int sumOdd = 0;

        for (int i = 0; i <= (numbers.size() - 1); i++) {
            if (i % 2 == 0) {
                sumOdd += numbers.get(i);
            }
        }
        
        // 8 - Calculate the average of the numbers (total sum divided by number)

        int AvgNum = 0;

        for (int w : numbers) {
            AvgNum += w;
        }
        AvgNum = (AvgNum / numbers.size());

        // 9 - Find the maximum number (hint: you'll need an `if` too)

        int max = 0;

        for (int i = 0; i <= (numbers.size() - 1); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        // 10 - Find the minimum number

        int min = max;

        for (int i = 0; i <= (numbers.size() - 1); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }


        // More difficult:


        // 11 - Display the number at the index indicated by the number at index 4

        int index = numbers.get(4);
        int insInd = numbers.get(index);

        System.out.println("The number at the indicated by the number at index 4 is " + insInd);

        // 12 - Display the numbers whose index is the same as the number itself

        for (int same = 0; same <= (numbers.size() -1); same++){
            if (same == numbers.get(same)){
                System.out.println("The number " + numbers.get(same) + " has the same index");
            }
        }

        // 13 - Swap the number at position 0 with the last number of the list.
        //      When I say "swap" I mean you have to change the positions of those
        //      numbers: move each one of them to the position of the other.
        // Example of how to set a value at index 5 of the list

        int First = numbers.get(0);
        numbers.set(0, numbers.get(numbers.size() - 1));
        numbers.set((numbers.size() - 1), First);

        // 14 - Swap the number at index 0 with the smallest value in the list

        int small = max;
        int pos = 0;

        for (int i = 0; i <= (numbers.size() -1); i++){
            if (numbers.get(i) < small){
                pos = i;
                small = numbers.get(i);
            }
        }

        int smallest = small;
        numbers.set(pos, numbers.get(0));
        numbers.set(0, small);


        // 15 - Given some start index swap the number at that index with the smallest
        //      number from that index. For example, if `start` is 3, find the smallest
        //      number from that index, ignoring lower indexes like 0, 1, 2.
        //      Just look from index 3 and above. Then swap the numbers.

        int oldPos = 3;
        int newMin = numbers.get(3);
        int newPos = oldPos;

        for (int i = newPos; i <= (numbers.size() - 1); i++) {
            if (numbers.get(i) <= newMin) {
                newPos = i;
                newMin = numbers.get(i);
            }
        }

        int newSmall = newMin;
        numbers.set(newPos, numbers.get(oldPos));
        numbers.set(oldPos, newSmall);


        // OK, you reached here! Even MORE difficult:


        // 16 - Find the repeated numbers (hint: you'll need a loop inside another)

        for (int x = 0; x < numbers.size(); x++){
            for (int y = 1+ x; y < numbers.size(); y++){
                if (numbers.get(x).equals(numbers.get(y))){
                    System.out.println(numbers.get(x) +" is the repeated number");
                }
            }
        }

        // 17 - Sort the list using the "selection sort algorithm":
        //      Start at index 0 and do what you did in exercise 15.
        //      Then move to index 1 and do the same.
        //      Then move to index 2 and do the same.
        //      When you get to the end of the list (to the last index) you're done!
        //      So, in other words, what you have to do is to repeat the process you
        //      did in ex 15 for every index in the list.



        for (int i = 0; i <= (numbers.size() - 1); i++){
            int preNum = numbers.get(i);
            int nextInd = i;

            for (int x = i; x <= (numbers.size() - 1); x++){
                if (numbers.get(x) <= preNum){
                    nextInd = x;
                    preNum = numbers.get(x);
                }
            }

            int nextNum = preNum;
            numbers.set(nextInd, numbers.get(i));
            numbers.set(i, nextNum);

        }

    }
}


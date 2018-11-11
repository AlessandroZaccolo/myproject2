package tech.bts.precourses.exercises;

import java.util.*;

/**
 * Function exercises.
 *
 * The `main` function is below. It runs tests for the functions.
 */
public class FunctionExercises {

    // The first function is done for you.
    // Solve the following ones.
    // Run the program to test the functions (the tests are written for you).

    /** Adds two numbers */
    private static int sum(int a, int b) {

        int result = a + b;
        return result;
    }


    /** Finds the average of two numbers */
    private static double average(double a, double b) {

        double result = (a + b)/ 2;
        return result;
    }

    /** Returns the number if it's positive, or returns 0 if it's negative */
    private static int atLeastZero(int number) {

        int result;
        if (number > 0){
            result = number;
        } else {
            result = 0;
        }
        return result;
    }

    /** Finds the maximum of two numbers */
    private static int max(int a, int b) {

        int result;
        if (a > b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }


    /** Finds the minimum of two numbers */
    private static int min(int a, int b) {

        int result;
        if (a < b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    /** Returns the longest text */
    private static String longest(String text1, String text2) {

        // You can use text1.length() to get the length of text1

        String result;
        if (text1.length() > text2.length()){
            result = text1;
        }   else {
            result = text2;
        }
        return result;
    }

    /** Returns the longest length */
    private static int longestLength(String text1, String text2) {

        // Try to use the max() function here!

        int result = max(text1.length(), text2.length());
        return result;
    }

    /** Returns the number of times a letter appears in a text */
    private static int countLetter(String text, char letter) {

        // You can use text.charAt(INDEX) to get the letter at that INDEX
        int result = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == letter){
                result++;
            }
        }
        return result;
    }

    /** Returns the text repeated the given times */
    private static String repeat(String text, int times) {

        // You can do `result += text` to append `text` to `result`
        String result = "";

        for (int i = 0; i < times; i++){
            result += text;
        }
        return result;

    }

    /** Returns a string that is similar to `text`, but replaces the first occurrence of `find` with `replace` */
    private static String replace(String text, String find, String replace) {

        String result = "";

        result = text.replaceFirst(find, replace);

        return result;
    }

    /** Returns the number of times the text appears in the list of texts */
    private static int countText(List<String> texts, String text) {

        // Use text1.equals(text2) to compare two texts.
        // In Java don't use `==` to compare Strings.


        int result = 0;

        for (int i = 0; i < texts.size(); i++){
            if(text.equals(texts.get(i))) {
                result++;
            }
        }
        return result;
    }

    /** Returns a list of texts those length is at most the given maxLength */
    private static List<String> shortTexts(List<String> texts, int maxLength) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i <= texts.size() -1 ; i++){
            if (texts.get(i).length() <= maxLength){
                result.add(texts.get(i));
            }
        }

        return result;



    }

    /** Returns a list of texts but in the reverse order */
    private static List<String> reverse(List<String> texts) {

        List<String> result = new ArrayList<>();

        for (int i = texts.size() - 1; i >= 0; i--){
            result.add(texts.get(i));
        }
        return result;
    }


    // -----------------------------------

    /**
     * This program runs tests for the functions defined above.
     */
    public static void main(String[] args) {

        assertEquals( sum(1,1), 2 );
        assertEquals( sum(7,-3), 4 );

        assertEquals( average(2, 4), 3.0 );
        assertEquals( average(2, 3), 2.5 );
        assertEquals( average(2, 2), 2.0 );
        assertEquals( average(-2, 2), 0.0 );

        assertEquals( atLeastZero(5), 5 );
        assertEquals( atLeastZero(-3), 0 );
        assertEquals( atLeastZero(-0), 0 );

        assertEquals( max(4,2), 4 );
        assertEquals( max(3,7), 7 );
        assertEquals( max(-6,3), 3 );

        assertEquals( min(4,2), 2 );
        assertEquals( min(3,7), 3 );
        assertEquals( min(-6,3), -6 );

        assertEquals( longest("dog", "horse"), "horse" );
        assertEquals( longest("big dog", "horse"), "big dog" );
        assertEquals( longest("", "hi"), "hi" );
        assertEquals( longest("something", ""), "something" );
        assertEquals( longest("", ""), "" );

        assertEquals( longestLength("dog", "horse"), 5 );
        assertEquals( longestLength("big dog", "horse"), 7 );
        assertEquals( longestLength("", "hi"), 2 );
        assertEquals( longestLength("something", ""), 9 );
        assertEquals( longestLength("", ""), 0 );

        assertEquals( countLetter("pie", 'i'), 1 );
        assertEquals( countLetter("coconut", 'o'), 2 );
        assertEquals( countLetter("abracadabra", 'a'), 5 );
        assertEquals( countLetter("CAPITAL LETTERS", 'a'), 0 );
        assertEquals( countLetter("", 'a'), 0 );

        assertEquals( repeat("once", 1), "once" );
        assertEquals( repeat("three", 3), "threethreethree" );
        assertEquals( repeat("-", 10), "----------" );
        assertEquals( repeat("nothing", 0), "" );
        assertEquals( repeat("", 5), "" );

        assertEquals( replace("the cat is here", "cat", "dog"), "the dog is here" );
        assertEquals( replace("a cat is a cat", "cat", "dog"), "a dog is a cat" );
        assertEquals( replace("the cat is here", "dog", "horse"), "the cat is here" );
        assertEquals( replace("demonstration", "demon", "admini"), "administration" );
        assertEquals( replace("demonstration", "tration", " here"), "demons here" );
        assertEquals( replace("some text", "not found", "something"), "some text" );
        assertEquals( replace("cellar", "ell", ""), "car" );

        assertEquals( countText(Arrays.asList("cat", "dog", "cat"), "cat"), 2 );
        assertEquals( countText(Arrays.asList("a", "a", "b", "a"), "a"), 3 );
        assertEquals( countText(Arrays.asList("white", "blue"), "red"), 0 );
        assertEquals( countText(Collections.emptyList(), "nope"), 0 );
        assertEquals( countText(Arrays.asList("hey", "", ""), ""), 2 );

        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 2),
                Arrays.asList("aa", "c") );
        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 3),
                Arrays.asList("aa", "c") );
        assertEquals( shortTexts(Arrays.asList("aa", "bbbb", "c"), 4),
                Arrays.asList("aa", "bbbb", "c") );
        assertEquals( shortTexts(Arrays.asList("  ", "a", "bb", "", "c"), 1),
                Arrays.asList("a", "", "c") );
        assertEquals( shortTexts(Collections.emptyList(), 5),
                Collections.emptyList() );

        assertEquals( reverse(Arrays.asList("a", "b", "c", "d")),
                Arrays.asList("d", "c", "b", "a") );
        assertEquals( reverse(Collections.emptyList()),
                Collections.emptyList() );

        System.out.println("All tests OK!");
    }

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
package tech.bts.javaexamples;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    public static String repeatString (String s, int n) {

        String result = "";
        for (int i = 1; i <= n; i++) {
            result += s;
        }
        return result;
    }

    public static String padLeft (String s, int n) {

        return repeatString(" ", n - s.length()) + s;
    }
    /** Returns a string containing 's? plus spaces to the left so the resulting string has lenght 'n' **/

    public static String padRight (String s, int n) {

        return s + repeatString(" ", n - s.length());
    }

}
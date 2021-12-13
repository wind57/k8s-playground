import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

public class Del {

    private static Pattern P = Pattern.compile(
            "\\s*" + // any number of whitespaces
            "\\d+" + // any number of digits
            "\\s*" + // any number of spaces
             /* a repeating group made of 3 parts:
             *  1) either the end of the string --> $
             *  2) either one that starts with --> -, followed by any number of digits and spaces
             *  3) same as (2), but start with comma
             *
             * This is also called a recursive pattern. It has the form:
             * ((a|b|c)+).
             *
             * See : https://www.regular-expressions.info/captureall.html
             */
            "(($|-\\s*(?=\\d+\\s*)\\d+\\s*|,\\s*(?=\\d+\\s*)\\d+\\s*)+)"
    );

    static boolean matches(String input) {
        return P.matcher(input).matches();
    }

    public static void main(String[] args) {
        System.out.println(1 << 4);
    }

}

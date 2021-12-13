import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DelTests {

    @Test
    public void test1() {
        String input = "80";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test2() {
        String input = "1-102";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test3() {
        String input = "  1  -102";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test4() {
        String input = "  1  -  102";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test5() {
        String input = "  1  -  102  ";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test6() {
        String input = "80, 81";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test7() {
        String input = "72,4-10,92";
        Assertions.assertTrue(Del.matches(input));
    }

    @Test
    public void test8() {
        String input = "72,4-10,92, 95, 100, 101-103";
        Assertions.assertTrue(Del.matches(input));
    }

    // invalid cases

    @Test
    public void test9() {
        String input = "72,";
        Assertions.assertFalse(Del.matches(input));
    }

    @Test
    public void test10() {
        String input = "72, 101-";
        Assertions.assertFalse(Del.matches(input));
    }

    @Test
    public void test11() {
        String input = "72, 101, -";
        Assertions.assertFalse(Del.matches(input));
    }

    @Test
    public void test12() {
        String input = "72, 101, 88,";
        Assertions.assertFalse(Del.matches(input));
    }


}

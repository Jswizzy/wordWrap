package name.jnsmith.wordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {

    public static final int LINE_LENGTH = 5;

    // a method that breaks words on specified space with a new line. like a word processor would.

    @Test
    public void lineShouldWrapIfOverLineLength() {
        String input = "The Sleepy";
        String expected = "The S\nleepy";

        String result = WordWrap.wrap(input, LINE_LENGTH);
        assertEquals(expected, result);
    }

    @Test
    public void shortLinesShouldNotWrap() {
        String input = "The";
        String expected = "The";

        String result = WordWrap.wrap(input, LINE_LENGTH);
        assertEquals(expected, result);
    }

    @Test
    public void longerLinesShouldWrapTwice() {
        String input = "The Sleepy Brow";
        String expected = "The S\nleepy\n Brow";

        String result = WordWrap.wrap(input, LINE_LENGTH);
        assertEquals(expected, result);
    }

    @Test
    public void longerLinesShouldWrapThrice() {
        String input = "The Sleepy Brown Fox";
        String expected = "The S\nleepy\n Brow\nn Fox";

        String result = WordWrap.wrap(input, LINE_LENGTH);
        assertEquals(expected, result);
    }
}

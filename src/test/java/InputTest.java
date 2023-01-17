import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>InputTest</h1>
 * @author Francois Boulay-Handfield
 */
class InputTest {

    /**
     * Tests if the input is a String
     * <h1></h1>
     */
    @Test
    void scanner() {
        assertNotNull(new Input("Test").scanner());
    }

    /**
     * Tests if the input is an Integer
     */
    @Test
    void input() {
        // todo
    }

    /**
     * Tests if the input is valid
     */
    @Test
    void getInput() {
        assertEquals("Test", new Input("Test").getInput());
    }
}
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {
    Hangman obj;

    @BeforeEach
    void setUp() {
    }

    @Test
    void randomWord() {
        obj= new Hangman();
        assertNotEquals("blah", obj.getRandomWord());
    }

    @AfterEach
    void tearDown() {
        }

}
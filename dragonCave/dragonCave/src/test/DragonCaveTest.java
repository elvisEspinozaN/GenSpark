import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class DragonCaveTest {
    DragonCave obj;

    @BeforeEach
    void setUp() { // before every test, create a new object
        obj= new DragonCave();
    }

    @DisplayName("Cave option - 1")
    @Test
    void caveOne() {
        assertEquals("You approach the cave... \n" +
                "It is dark and spooky... \n" +
                "A large dragon jumps out in front of you! He opens his jaws and.. \n" +
                "Gobbles you down in one bite!", obj.cave("1"));
    }

    @DisplayName("Cave option - 2")
    @Test
    void caveTwo() {
        assertEquals("You approach the cave... \n" +
                "It is dark and spooky... \n" +
                "A large dragon jumps out in front of you! He opens his jaws and.. \n" +
                "Shares all of his treasure!", obj.cave("2"));
    }

    @AfterEach
    void tearDown() {
    }
}
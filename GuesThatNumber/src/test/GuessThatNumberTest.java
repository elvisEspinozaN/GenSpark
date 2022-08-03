import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class GuessThatNumberTest {
    GuessThatNumber obj;

    @BeforeEach
    void setUp() {
    }

    @DisplayName("Setting name : ")
    @Test
    void setName() {
        ByteArrayInputStream by = new ByteArrayInputStream("John Doe".getBytes());
        System.setIn(by);
        obj = new GuessThatNumber();
        obj.setName();
        assertEquals("John Doe", obj.name);
    }

    @AfterEach
    void tearDown() {
    }
}
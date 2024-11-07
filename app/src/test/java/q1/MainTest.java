package q1;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testGetGreeting()
    {
        String greeting;
        greeting = Main.getGreeting(1);
        assertTrue(greeting.equals("hello world"));
    }    
}

package q2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

    
public class MainTest {
    @Test
    void testGetGreeting()
    {
        String greeting;
        greeting = Main.getGreeting(2);
        assertTrue(greeting.equals("hello world"));
    }    
}
    

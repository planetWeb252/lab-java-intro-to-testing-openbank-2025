import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class KeywordsReservedTest {
    @Test
    @DisplayName("Java palabras reservadas ==> true")
    public void testReservedKeywordsTrue(){
        assertTrue(KeywordsReserved.reservedWord("Don't break my heart"));

    }
    @Test
    @DisplayName("Java palabras reservadas ==> false")
    public void testReservedKeywordsFalse(){
        assertFalse(KeywordsReserved.reservedWord("I love to breakdance"));

    }









}

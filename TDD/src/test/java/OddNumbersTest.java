import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbersTest {
    @Test
    @DisplayName("Test numeros Impares")
    public void testNumbersOdd(){
      ArrayList<Integer> oddNumbers=new ArrayList<>(Arrays.asList(1,3,5,7,9));
      assertEquals(oddNumbers,OddNumbers.getOddNumbers(10));
    }
}

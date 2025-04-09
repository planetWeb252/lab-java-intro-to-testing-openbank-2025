import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {
    Elf elf = new Elf(100, 100, 10, 100, 50);
    @Test
    @DisplayName("Test propierties Elf")
    public void testElf(){
        assertEquals(100,elf.getHealth());
        assertEquals(100,elf.getStrength());
        assertEquals(10,elf.getLives());
        assertEquals(100,elf.getOriginalHealth());
        assertEquals(50,elf.getSpeed());

    }

    @Test
    @DisplayName("Test decremente lives ")
    public void decremente_live_elf(){
        assertEquals(9,elf.getLives()-1);

    }
}

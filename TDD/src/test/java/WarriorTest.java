import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    Warrior wr=new Warrior(100,100,10,100,50);
    @Test
    @DisplayName("Test propierties of Warrior")
    public void propiertiesOfWarrior(){
        assertEquals(100,wr.getHealth());
        assertEquals(100,wr.getStrength());
        assertEquals(10,wr.getLives());
        assertEquals(100,wr.getOriginalHealth());
        assertEquals(50,wr.getForce());


    }

    @Test
    @DisplayName("Convert warrior to Elf")
    public void convertWarriorToElf(){
       Elf elf= wr.convertToElf();
        assertEquals(100,elf.getHealth());
        assertEquals(100,elf.getStrength());
        assertEquals(10,elf.getLives());
        assertEquals(100,elf.getOriginalHealth());
        assertEquals(50,elf.getSpeed());
    }

}

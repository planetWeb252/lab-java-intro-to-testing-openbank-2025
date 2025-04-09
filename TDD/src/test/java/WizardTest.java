import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
public class WizardTest {
    Wizard wz=new Wizard(100,100,10,100,50);
    @Test
    @DisplayName("Test propierties of Wizard")
    public void propiertiesOfWarrior(){
        assertEquals(100,wz.getHealth());
        assertEquals(100,wz.getStrength());
        assertEquals(10,wz.getLives());
        assertEquals(100,wz.getOriginalHealth());
        assertEquals(50,wz.getSpell());


    }

    @Test
    @DisplayName("Convert Wizar to Elf")
    public void convertWarriorToElf(){
        Elf elf= wz.converToElf();
        assertEquals(100,elf.getHealth());
        assertEquals(100,elf.getStrength());
        assertEquals(10,elf.getLives());
        assertEquals(100,elf.getOriginalHealth());
        assertEquals(50,elf.getSpeed());
    }

}

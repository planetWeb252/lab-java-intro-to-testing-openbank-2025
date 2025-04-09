import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    @DisplayName("Test decrementLive by 1, start 100 expected 99")
    public void decrement_live_test(){
        Warrior wr=new Warrior(100,100,10,100,50);
        assertEquals(99,wr.getHealth()-1);

    }


    @Test
    @DisplayName("Test attack by current Player")
    public void attackTest(){
        Warrior wr=new Warrior(100,100,10,100,50);
        Elf elf=new Elf(15,25,80,90,50);
        assertEquals(75,wr.getHealth()-elf.getStrength());
    }




}

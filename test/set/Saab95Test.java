package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class Saab95Test {// Done!
    // OBS! The methods that are being tested below need to be set to public to run
    // these tests!
    @Test
    public void test_if_saab_subclass_of_Car() {
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Car);
    }
    // @Test
    // public void test_setTurboOn(){
    // Saab95 saab = new Saab95();
    // saab.setTurboOn();
    // assertTrue(saab.turboOn == true);
    // }
    // @Test
    // public void test_setTurboOff(){
    // Saab95 saab = new Saab95();
    // saab.setTurboOn();
    // saab.setTurboOff();
    // assertTrue(saab.turboOn == false);
    // }
    // @Test
    // public void test_speedFactor(){

    // Saab95 saab = new Saab95();
    // assertEquals(1.25, saab.speedFactor(), 0);
    // saab.setTurboOn();
    // assertEquals(1.625, saab.speedFactor(), 0);
    // }
}

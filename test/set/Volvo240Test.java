package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class Volvo240Test {// Done!

    @Test
    public void test_if_volvo_subclass_of_Car() {
        Volvo240 volvo = new Volvo240();
        assertTrue(volvo instanceof Car);
    }
    // OBS! These methods need to be set to public before tested!
    // @Test
    // public void test_speedFactor(){

    // Volvo240 volvo = new Volvo240();
    // assertEquals(1.25, volvo.speedFactor(), 0);
    // }
}

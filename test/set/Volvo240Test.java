package set;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import set.model.*;
import set.model.Volvo240;

public class Volvo240Test {// Done!

    @Test
    public void test_if_volvo_subclass_of_Car() {
        Volvo240 volvo = new Volvo240();
        assertTrue(volvo instanceof Car);
    }
}

package set;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import set.model.*;
import set.model.Saab95;

public class Saab95Test {// Done!
    @Test
    public void test_if_saab_subclass_of_Car() {
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Car);
    }
}

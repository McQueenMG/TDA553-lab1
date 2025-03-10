package set;

import java.awt.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import set.model.*;
import set.model.Saab95;
import set.model.Volvo240;

public class CarTest { // Done!

    @Test
    public void test_if_superclass() {

        Volvo240 volvo = new Volvo240();
        assertTrue(volvo instanceof Car);
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Car);
    }


    @Test
    public void test_getEnginePower() {
        Volvo240 volvo = new Volvo240();
        assertEquals(100, volvo.getEnginePower(), 0);

    }

    @Test
    public void test_gas() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1);
        assertEquals(0.125, volvo.getCurrentSpeed(), 0);
    }

    @Test
    public void test_if_gas_throws_exception() {

        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Volvo240 volvo = new Volvo240();
                volvo.gas(2);
            }
        });
    }

    @Test
    public void test_brake() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1);
        volvo.brake(0.1);
        assertEquals(0, volvo.getCurrentSpeed(), 0);
    }

    @Test
    public void test_if_brake_throws_exception() {

        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Volvo240 volvo = new Volvo240();
                volvo.brake(2);
            }
        });
    }

    @Test
    public void test_turns_to_left() {

        Volvo240 volvo = new Volvo240();
        volvo.turnLeft();
        assertEquals(90, volvo.getDirection(), 0);

    }

    @Test
    public void test_turns_to_right() {

        Volvo240 volvo = new Volvo240();
        volvo.turnRight();
        assertEquals(-90, volvo.getDirection(), 0);

    }
}

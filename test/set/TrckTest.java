package set;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class TrckTest {

    @Test
    public void test_if_gas_throws_exception_due_to_platform() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.changePlatform(20);
                scania.gas(0.1);
            }
        });
    }

    @Test
    public void test_if_brake_throws_exception_due_to_platform() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.changePlatform(20);
                scania.brake(0.1);
            }
        });
    }
}

package set;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class ScaniaTest {


    @Test
    public void test_getPlatformAngle(){
        Scania scania = new Scania();
        assertEquals(0, scania.getPlatformAngle(), 0);

    }

    @Test
    public void test_changePlatform(){
        Scania scania = new Scania();
        scania.changePlatform(20);
        assertEquals(20, scania.getPlatformAngle(), 0);
    }
    @Test
    public void test_if_changePlatform_throws_exception(){
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.gas(0.1);
                scania.changePlatform(20);
            }
        });
    }
}
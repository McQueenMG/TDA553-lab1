package set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class CarRepairShopTest {

    @Test
    public void test_loadCar(){
        CarRepairShop carRepairShop = new CarRepairShop("testshop", 0, 0, 3);
        Volvo240 volvo240 = new Volvo240();
        carRepairShop.loadCar(volvo240);
        assertTrue(volvo240.isCarInStorage());
        
    }

    @Test
    public void test_if_loadCar_throws_exception() {
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Volvo240 volvo240 = new Volvo240();
                CarRepairShop carRepairShop = new CarRepairShop("BertillsShop", 12, 12, 13);
                carRepairShop.loadCar(volvo240);
            }
        });
    }

    @Test
    public void test_unloadCar(){
        CarRepairShop carRepairShop = new CarRepairShop("testshop", 0, 0, 3);
        Volvo240 volvo240 = new Volvo240();
        carRepairShop.loadCar(volvo240);
        carRepairShop.unloadCar(volvo240);
        assertFalse(volvo240.isCarInStorage());
        
    }

    @Test
    public void test_if_unloadCar_throws_exception() {
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                Volvo240 volvo240 = new Volvo240();
                CarRepairShop carRepairShop = new CarRepairShop("BertillsShop", 0, 0, 13);
                carRepairShop.unloadCar(volvo240);
            }
        });
    }
}
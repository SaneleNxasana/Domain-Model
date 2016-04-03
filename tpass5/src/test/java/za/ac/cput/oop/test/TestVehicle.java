package za.ac.cput.oop.test;

import org.junit.Test;
import za.ac.cput.oop.factories.VehicleFactory;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class TestVehicle {
    @Test
    public void testVehicle() throws Exception {

        String vehicle = VehicleFactory.getVehicle(1);
        System.out.println("Appropriate vehicle is: "+vehicle);

    }
}

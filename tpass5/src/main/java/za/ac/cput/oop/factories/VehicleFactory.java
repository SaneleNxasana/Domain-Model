package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.*;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class VehicleFactory {

    public static String getVehicle(int value){
        Vehicle chain = setUpChain();
        return chain.vehicleSeats(value);
    }

    public static Vehicle setUpChain(){
        Vehicle coupe = new Coupe();
        Vehicle sedan = new Sedan();
        Vehicle suv = new SUV();
        Vehicle minibus = new Minibus();

        coupe.setNextVehicle(sedan);
        sedan.setNextVehicle(suv);
        suv.setNextVehicle(minibus);

        return coupe;
    }
}

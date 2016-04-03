package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public abstract class Vehicle {
    Vehicle nextVehicle;

    public void setNextVehicle(Vehicle nextVehicle){
        this.nextVehicle = nextVehicle;
    }
    public abstract String vehicleSeats(int seats);
}

package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class Coupe extends Vehicle{
    @Override
    public String vehicleSeats(int seats)
    {
        if(seats >= 1 && seats <= 2)
        {
            return "Coupe";
        }
        else
        {
            if(nextVehicle != null)
            {
                return nextVehicle.vehicleSeats(seats);
            }
            return "Vehicle not available.";
        }
    }
}

package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class Minibus extends Vehicle{
    @Override
    public String vehicleSeats(int seats)
    {
        if(seats > 5 && seats <= 12)
        {
            return "Minibus";
        }
        else
        {
            if(nextVehicle != null)
            {
                return nextVehicle.vehicleSeats(seats);
            }
            return "Vehicle not available";
        }
    }
}

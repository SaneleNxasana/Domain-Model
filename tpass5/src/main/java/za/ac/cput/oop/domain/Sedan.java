package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class Sedan extends Vehicle{
    @Override
    public String vehicleSeats(int seats)
    {
        if(seats >= 2 && seats <= 4 )
        {
            return "Sedan";
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

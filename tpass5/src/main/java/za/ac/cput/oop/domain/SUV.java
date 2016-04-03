package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class SUV extends Vehicle{
    @Override
    public String vehicleSeats(int seats)
    {
        if (seats >= 2 && seats <= 5)
        {
            return "SUV";
        }
        else
        {
            if (nextVehicle != null)
            {
                return nextVehicle.vehicleSeats(seats);
            }
            return "Vehicle not available.";
        }
    }
}

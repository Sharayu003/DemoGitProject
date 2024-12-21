package Main.Java.Strategies;

import Main.Java.Models.ParkingSpot;
import Main.Java.Models.VehicleType;

public interface ParkingPlaceAllotmentStrategy {
    ParkingSpot getParkingSpot(VehicleType vehicleType, Long parkingLotId);
}

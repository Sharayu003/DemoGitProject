package Main.Java.Repository;

import Main.Java.Models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> vehicleMap = new HashMap<>();

    public  void save(Vehicle vehicle) {
        vehicleMap.put(vehicle.getNumber(), vehicle);
    }

    public Vehicle getVehicleByNumber(String VehicleNumber){
        if(vehicleMap.containsKey(VehicleNumber)){
            return vehicleMap.get(VehicleNumber);
        }
        return null;
    }
}

package Main.Java.Models;

import java.util.List;

public class ParkingLot {
    private List<Floor> floor;
    private List<Gate> gate;
    private ParkingLotStatus parkingStatus;


    public List<Floor> getFloor() {
        return floor;
    }

    public void setFloor(List<Floor> floor) {
        this.floor = floor;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }
}

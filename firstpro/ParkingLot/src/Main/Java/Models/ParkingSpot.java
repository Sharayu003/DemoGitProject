package Main.Java.Models;

public class ParkingSpot {
    private int number;
    private VehicleType vehicletype;
    private ParkingLotStatus status;
    private Floor floor;

    public ParkingSpot(int number, VehicleType vehicletype, ParkingLotStatus status, Floor floor) {
        this.number = number;
        this.vehicletype = vehicletype;
        this.status = status;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(VehicleType vehicletype) {
        this.vehicletype = vehicletype;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}

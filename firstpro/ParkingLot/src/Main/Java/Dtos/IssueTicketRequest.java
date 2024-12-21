package Main.Java.Dtos;

import Main.Java.Models.VehicleType;

public class IssueTicketRequest {
    private VehicleType vehicletype;
    private String VehicleNumber;
    private String ownener;
    private Long gateId;
    private Long parkingLotId;

    public VehicleType getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(VehicleType vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getOwnener() {
        return ownener;
    }

    public void setOwnener(String ownener) {
        this.ownener = ownener;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}

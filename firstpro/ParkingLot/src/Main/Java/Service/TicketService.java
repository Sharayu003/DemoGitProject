package Main.Java.Service;

import Main.Java.Dtos.IssueTicketRequest;
import Main.Java.Exception.GateNotFoundException;
import Main.Java.Exception.ParkingLotNotFoundException;
import Main.Java.Models.Gate;
import Main.Java.Models.ParkingLot;
import Main.Java.Models.Ticket;
import Main.Java.Models.Vehicle;
import Main.Java.Repository.GateRepository;
import Main.Java.Repository.ParkingLotRepository;
import Main.Java.Repository.VehicleRepository;

import java.util.Date;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository  parkingLotRepository;

    public Ticket issueTicket(IssueTicketRequest request) throws GateNotFoundException, ParkingLotNotFoundException {
        //object creation
        Ticket ticket = TicketService.issueTicket(request);
        //set time
        ticket.setEntryTime(new Date());
        //getting Vehicle and gate Details

        Gate gate = gateRepository.FindGateById(request.getGateId());
        ticket.setGate(gate);

        Vehicle vehicle = VehicleRepository.getVehicleByNumber(request.getVehicleNumber());
        if(vehicle==null){
            vehicle = new Vehicle(request.getVehicleNumber(), request.getVehicletype(), request.getOwnener());
            VehicleRepository.save(vehicle);
        }
        ticket.setVehicle(vehicle);

        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(request.getParkingLotId());


        return null;
    }
}

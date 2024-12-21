package Main.Java.Controller;

import Main.Java.Dtos.IssueTicketRequest;
import Main.Java.Dtos.IssueTicketResponse;
import Main.Java.Exception.GateNotFoundException;
import Main.Java.Exception.ParkingLotNotFoundException;
import Main.Java.Models.Ticket;
import Main.Java.Service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public IssueTicketResponse issueTicket(IssueTicketRequest request){
        Ticket ticket = null;
        try{
           ticket =  ticketService.issueTicket(request);
        }catch (GateNotFoundException e){
            System.out.println("Gate Not Found");
            return new IssueTicketResponse(null,"Failure","Invalid Gate");
        } catch (ParkingLotNotFoundException e) {
            System.out.println("Parking Lot Not Found");
            return new IssueTicketResponse(null,"Failure","Invalid ParkingLot");
        }

        return new IssueTicketResponse(ticket,"Success","Ticket Generated");
    }
}

package Main.Java.Dtos;

import Main.Java.Models.Ticket;

public class IssueTicketResponse {
    private Ticket ticket;
    private String response;
    private String messege;

    public IssueTicketResponse(Ticket ticket, String response, String messege) {
        this.ticket = ticket;
        this.response = response;
        this.messege = messege;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }
}

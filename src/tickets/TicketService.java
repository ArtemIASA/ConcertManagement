package tickets;

import finances.Finances;
import visitor.Visitor;

import java.util.LinkedList;

public class TicketService {
    private LinkedList<Ticket> tickets = new LinkedList<Ticket>();

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public boolean deleteTicket(Ticket ticket){
        return tickets.remove(ticket);
    }

    public void returnTicket(Visitor visitor) {
        for (Ticket ticket : tickets){
            if(ticket.visitor.equals(visitor) &&
                    ticket.concertName.equals(ticket.concertName)){
                deleteTicket(ticket);

            }
        }
    }

    public void buyTicket(Visitor visitor, String concertName){
        Ticket ticket = new Ticket(visitor, concertName);
        tickets.add(ticket);
    }
}

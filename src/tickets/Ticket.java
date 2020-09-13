package tickets;

import visitor.Visitor;


public class Ticket {
    final public Visitor visitor;
    final public String concertName;

    public Ticket(Visitor visitor, String concertName){
        this.visitor = visitor;
        this.concertName = concertName;
    }

}

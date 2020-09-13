package concert;

import java.util.Date;

final public class Concert {
    final public String name;
    final public ConcertType type;
    final public String arenaName;
    private Date date;
    private int numOfTickets;
    private int ticketPrice;

    public Concert(String name, ConcertType type, String arenaName, Date date, int numOfTickets, int ticketPrice) {
        this.name = name;
        this.type = type;
        this.arenaName = arenaName;
        this.date = date;
        this.numOfTickets = numOfTickets;
        this.ticketPrice = ticketPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice(){
        return ticketPrice;
    }

    public void setNumOfTickets(int numOfTickets){
        this.numOfTickets = numOfTickets;
    }

    public void incrementNumOfTickets(){
        numOfTickets++;
    }

    public int getNumOfTickets(int numOfTickets){
        return this.numOfTickets;
    }

}

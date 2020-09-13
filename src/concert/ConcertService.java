package concert;

import java.util.Date;
import java.util.LinkedList;

public class ConcertService {
    final private LinkedList<Concert> concerts = new LinkedList<>();
    
    public void addConcert(Concert concert){
        concerts.add(concert);
    }
    
    public boolean deleteConcert(Concert concert){
       return(concerts.remove(concerts));
    }

    public Concert getConcertByName(String name){
        for(Concert concert: concerts){
            if(concert.name.equals(name))
                return concert;
        }
        throw new ArrayIndexOutOfBoundsException("Concert with name: " + name + " does not exist");
    }

    public int getPriceByName(String concertName) {
        Concert concert = getConcertByName(concertName);
        return concert.getPrice();
    }

    public changeDate(String concertName, Date date){
        Concert concert = getConcertByName(concertName);
        concert.setDate(date);
    }

    public void incrementTicket(String concertName){
        Concert concert = getConcertByName(concertName);
        concert.incrementNumOfTickets();
    }
}

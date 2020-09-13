package main;

import arena.Arena;
import arena.ArenaService;
import concert.Concert;
import concert.ConcertService;
import concert.ConcertType;
import finances.FinanceService;
import lessee.Lessee;
import lessee.LesseeService;
import tickets.TicketService;
import visitor.Visitor;
import visitor.VisitorService;

import java.util.Date;

public class AppService {
    final private VisitorService visitorService = new VisitorService();
    final private LesseeService lesseeService = new LesseeService();
    final private ArenaService arenaService = new ArenaService();
    final private ConcertService concertService = new ConcertService();
    final private TicketService ticketService = new TicketService();
    final private FinanceService financeService = new FinanceService();

    public void addVisitor(String name, String phoneNumber, String concertName){
        Visitor visitor = new Visitor(name, phoneNumber);
        addTicket(visitor, concertName);
        System.out.println("Creating new visitor: " + name
                + ", phone: " + phoneNumber);
        visitorService.addVisitor(visitor);
    }

    public void addArena(String name, String address, int capacity){
        Arena arena = new Arena(name, address, capacity);
        System.out.println("Creating new arena: " + name +
                ", address: " + address +
                ", capacity: " + capacity);
        arenaService.addArena(arena);
    }

    public void addLessee(String name, String phoneNumber, String email){
        Lessee lessee = new Lessee(name, phoneNumber, email);
        System.out.println("Creating new lessee: " + name +
                ", phone: " + phoneNumber +
                ", email:" + email);
        lesseeService.addLessee(lessee);
    }

    public void addConcert(String name, ConcertType type, String arenaName,
                           Date date, int ticketPrice, int payment, int expenses){
        Concert concert = new Concert(name, type, arenaName, date, 0, ticketPrice);
        System.out.println("Creating new concert: " + name +
                ", type: " + type +
                ", arena: " + arenaName +
                ", date: " + date.toString() +
                ", ticketPrice: " + ticketPrice);
        concertService.addConcert(concert);
        financeService.changeProfit(name, payment);
        financeService.changeExpenses(name, expenses);
    }

    public void addTicket(Visitor visitor, String concertName) {
        ticketService.buyTicket(visitor, concertName);
        int price = concertService.getPriceByName(concertName);
        financeService.changeProfit(concertName, price);
        concertService.incrementTicket(concertName);
    }


}

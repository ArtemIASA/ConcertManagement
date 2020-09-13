package main;

import concert.ConcertType;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

final public class App {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar();
        calendar.set(120,8, 30);
        AppService appService = new AppService();

        System.out.println("Let`s add arena");

        appService.addArena("Olympyskiy", "Mazepi str, 3", 40000);

        System.out.println("Let`s add one lessee\n");

        appService.addLessee("Cool Manager","050-333-2222", "coolman@mail.com");

        System.out.println("Let`s add concert\n");

        appService.addConcert("The Weeknd", ConcertType.MUSIC, "Olympyskiy",
                calendar.getTime(), 100, 100000, 1000000);

        System.out.println("3 visitors bought tickets\n");

        appService.addVisitor("Artem Pogorelov", "067-589-2524", "The Weeknd");
        appService.addVisitor("Rita Yusupova", "098-874-2544", "The Weeknd");
        appService.addVisitor("Kylo Ren", "050-242-2433", "The Weeknd");



    }
}

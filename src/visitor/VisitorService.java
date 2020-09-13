package visitor;

import java.util.LinkedList;

final public class VisitorService {
    final private LinkedList<Visitor> visitors = new LinkedList<>();

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public boolean deleteVisitor(Visitor visitor){
        return visitors.remove(visitor);
    }

    public void buyTicket(Visitor visitor, String concertName){

    }

}

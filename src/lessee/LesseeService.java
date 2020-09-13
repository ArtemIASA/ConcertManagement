package lessee;

import java.util.LinkedList;

public final class LesseeService {
    final private LinkedList<Lessee> lessees = new LinkedList<>();

    public void addLessee(Lessee lessee){
        lessees.add(lessee);
    }

    public void deleteLessee(Lessee lessee){
        lessees.remove(lessee);
    }
}

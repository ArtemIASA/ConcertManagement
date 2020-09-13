package arena;

import java.util.LinkedList;

public class ArenaService {
    final private LinkedList<Arena> arenas = new LinkedList<>();

    public void addArena(Arena arena){
        arenas.add(arena);
    }

    public boolean deleteArena(Arena arena){
        return(arenas.remove(arena));
    }


}

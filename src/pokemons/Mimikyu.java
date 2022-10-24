package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;
public class Mimikyu extends Pokemon{

    public Mimikyu(String name, int level){
        super(name, level);
        this.setType(Type.GHOST, Type.FAIRY);
        this.setMove(new ZingZap(), new Tickle(), new Discharge(), new  Nuzzle());
        this.setStats(55, 90, 80, 50, 105, 96);
    }
}
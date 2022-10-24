package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;

public class NidoranM extends Pokemon{

    public NidoranM(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setMove(new IceBeam(), new PoisonSting());
        this.setStats(46, 57, 40, 40, 40, 50);
    }
}

package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;
public class Nidoking extends NidoranM{

    public Nidoking(String name, int level){
        super(name, level);
        this.setType(Type.POISON, Type.GROUND);
        this.setMove(new IceBeam(), new PoisonSting(), new Leer(), new  SmartStrike());
        this.setStats(81, 102, 77, 85, 75, 85);
    }
}
package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;
public class Nidorino extends NidoranM{

    public Nidorino(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setMove(new IceBeam(), new PoisonSting(), new Leer());
        this.setStats(61, 72, 57, 55, 55, 65);
    }
}

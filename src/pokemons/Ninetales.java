package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;
public class Ninetales extends Vulpix{

    public Ninetales(String name, int level){
        super(name, level);
        this.setType(Type.FIRE);
        this.setMove(new QuickAttack(), new Swagger(), new ConfuseRay(), new NastyPlot());
        this.setStats(73, 76, 75, 81, 100, 100);
    }
}

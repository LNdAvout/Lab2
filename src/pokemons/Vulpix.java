package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;
public class Vulpix extends Pokemon{

    public Vulpix(String name, int level){
        super(name, level);
        this.setType(Type.FIRE);
        this.setMove(new QuickAttack(), new Swagger(), new ConfuseRay());
        this.setStats(38, 41, 40, 50, 65, 65);
    }
}

package attack;

import ru.ifmo.se.pokemon.*;

public class Nuzzle extends PhysicalMove {

    public Nuzzle(){
        super(Type.ELECTRIC, 0.2, 1);
    }

    @Override
    protected String describe() {
        return "Использует Nuzzle";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.25){
            pokemon.addEffect(new Effect().stat(Stat.ATTACK, 0));
            pokemon.addEffect(new Effect().stat(Stat.SPEED, (int) Math.round(pokemon.getStat(Stat.SPEED) / 2)));
        }
    }
}

package attack;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "Использует Leer";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.DEFENSE, (int) Math.round(pokemon.getStat(Stat.DEFENSE) - 1)));
    }
}

package attack;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {

    public Tickle(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected String describe() {
        return "Использует Tickle";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.HP, (int) Math.round(pokemon.getHP() - 1)).stat(Stat.ATTACK,
                (int) Math.round(pokemon.getStat(Stat.ATTACK) - 1)));
    }
}

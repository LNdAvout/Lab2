package attack;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected String describe() {
        return "Использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, (int) Math.round(pokemon.getStat(Stat.ATTACK) + 2)));
    }
}
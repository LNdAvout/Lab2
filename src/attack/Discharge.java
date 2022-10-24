package attack;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {

    public Discharge() {
        super(Type.ELECTRIC, 0.8, 1);
    }

    @Override
    protected String describe() {
        return "Использует Discharge";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(pokemon);
            if (!pokemon.hasType(Type.ELECTRIC)) {
                pokemon.setMod(Stat.SPEED, 2);
                if (Math.random() <= 0.25) {
                    pokemon.addEffect(new Effect().stat(Stat.ATTACK, 0));
                }
            }
        }
    }
}

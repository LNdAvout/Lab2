package attack;

import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {

    public PoisonSting(){
        super(Type.POISON, 0.15, 1);
    }

    @Override
    protected String describe() {
        return "Использует Poison Sting";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.poison(pokemon);
            if (!pokemon.hasType(Type.POISON) || !pokemon.hasType(Type.STEEL)) {
                pokemon.addEffect(new Effect().turns(-1).stat(Stat.HP, (int) Math.round(pokemon.getHP() * 7 / 8)));
            }
        }
    }
}

package attack;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {

    public ConfuseRay(){
        super(Type.GHOST, 0, 1);
    }

    @Override
    protected String describe() {
        return "Использует Confuse Ray";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.33).stat(Stat.HP, (int) Math.round(pokemon.getHP() -
                Math.abs(pokemon.getStat(Stat.ATTACK) - 40))));
    }
}

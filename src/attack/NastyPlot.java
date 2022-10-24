package attack;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {

    public NastyPlot(){
        super(Type.DARK , 0, 0);
    }

    @Override
    protected String describe() {
        return "Использует Nasty Plot";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, (int) Math.round(pokemon.getStat(Stat.SPECIAL_ATTACK) + 2));
    }
}

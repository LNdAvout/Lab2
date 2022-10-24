package attack;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam(){
        super(Type.ICE, 0.9, 1);
    }

    @Override
    protected String describe() {
        return "Использует Ice Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1){
            Effect.freeze(pokemon);
            if (!pokemon.hasType(Type.ICE)) {
                pokemon.addEffect(new Effect().stat(Stat.ATTACK, 0));
            }
        }
    }
}

package attack;

import ru.ifmo.se.pokemon.*;

public class ZingZap extends PhysicalMove {

    public ZingZap(){
        super(Type.ELECTRIC, 0.8, 1);
    }

    @Override
    protected String describe() {
        return "Использует Zing Zap";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.confuse(pokemon);
        }
    }
}

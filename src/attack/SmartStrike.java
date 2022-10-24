package attack;

import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove {

    public SmartStrike(){
        super(Type.STEEL, 0.7, 1);
    }

    @Override
    protected String describe() {
        return "Использует Smart Strike";
    }
}

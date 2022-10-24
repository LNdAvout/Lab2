package attack;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {

    public QuickAttack(){
        super(Type.NORMAL, 0.4, 1);
    }

    @Override
    protected String describe() {
        return "Использует Quick Attack";
    }
}

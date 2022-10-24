import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Mimikyu("Михаил", 10));
        battle.addFoe(new Vulpix("Владимир", 10));
        battle.addAlly(new Ninetales("Никита", 10));
        battle.addFoe(new NidoranM("Недора", 10));
        battle.addAlly(new Nidorino("Неарина", 10));
        battle.addFoe(new Nidoking("Нелёва", 10));

        battle.go();
    }
}

package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Ninjask extends Nincada {
    public Ninjask(String s, int i) {
        super(s, i);
        this.setType(Type.BUG, Type.FLYING);
        this.setStats(61.0, 90.0, 45.0, 50.0, 50.0, 160.0);
        this.setMove(new Confide(), new AerialAce(), new DoubleTeam(), new Slash());
    }
}

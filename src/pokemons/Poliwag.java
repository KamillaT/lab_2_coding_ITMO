package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {
    public Poliwag(String s, int i) {
        super(s, i);
        this.addType(Type.WATER);
        this.setStats(40.0, 50.0, 40.0, 40.0, 40.0, 90.0);
        this.setMove(new DoubleTeam(), new Scald());
    }
}

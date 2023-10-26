package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String s, int i) {
        super(s, i);
        this.addType(Type.WATER);
        this.setStats(65.0, 65.0, 65.0, 50.0, 50.0, 90.0);
        this.setMove(new DoubleTeam(), new Scald(), new BodySlam());
    }
}

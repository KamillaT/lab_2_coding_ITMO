package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String s, int i) {
        super(s, i);
        this.setType(Type.WATER, Type.FIGHTING);
        this.setStats(40.0, 50.0, 40.0, 40.0, 40.0, 90.0);
        this.setMove(new DoubleTeam(), new Scald(), new BodySlam(), new Submission());
    }
}

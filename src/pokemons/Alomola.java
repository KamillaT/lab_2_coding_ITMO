package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Alomola extends Pokemon {
    public Alomola(String s, int i) {
        super(s, i);
        this.addType(Type.WATER);
        this.setStats(165.0, 75.0, 80.0, 40.0, 45.0, 65.0);
        this.setMove(new WakeUpSlap(), new Tickle(), new Scald(), new Refresh());
    }
}

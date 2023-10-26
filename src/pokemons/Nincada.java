package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Nincada extends Pokemon {
    public Nincada(String s, int i) {
        super(s, i);
        this.setType(Type.BUG, Type.GROUND);
        this.setStats(31.0, 45.0, 90.0, 30.0, 30.0, 40.0);
        this.setMove(new Confide(), new AerialAce(), new DoubleTeam());
    }
}

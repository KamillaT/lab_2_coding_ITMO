package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0.0, 0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Random r = new Random();
        int low = 1;
        int high = 7;
        int res = r.nextInt(high-low) + low;
        Effect e = new Effect().chance(1).turns(-1).stat(Stat.EVASION, +res);
        pokemon.addEffect(e);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Double Team => повышена собственная уклончивость";
    }
}

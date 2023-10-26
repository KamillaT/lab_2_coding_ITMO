package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60.0, Double.POSITIVE_INFINITY);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ACCURACY, 100);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует AerialAce";
    }
}

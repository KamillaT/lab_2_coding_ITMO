package moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80.0, 100.0);
    }

    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.3).condition(Status.BURN));
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Scald";
    }
}

package moves;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует BodySlam";
    }
}

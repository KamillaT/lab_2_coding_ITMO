package moves;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap() {
        super(Type.FIGHTING, 70.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        power *= 2;
        if (pokemon.getCondition() == Status.SLEEP) {
            pokemon.setCondition(new Effect().condition(Status.NORMAL));
        }
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует WakeUpSlap";
    }
}

package moves;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0.0, 0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Status[] s = new Status[]{pokemon.getCondition()};
        for (Status c : s) {
            if (c == Status.PARALYZE || c == Status.POISON || c == Status.BURN) {
                pokemon.setCondition(new Effect().condition(Status.NORMAL));
                break;
            }
        }
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Refresh";
    }
}

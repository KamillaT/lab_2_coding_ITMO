package moves;

import ru.ifmo.se.pokemon.*;

public class Submission extends PhysicalMove {
    public Submission() {
        super(Type.FIGHTING, 80.0, 80.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) * 1.25));
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Submission";
    }
}

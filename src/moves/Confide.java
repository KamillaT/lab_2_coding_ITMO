package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Confide => специальная атака противника понижена";
    }
}

package moves;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {
    public Tickle() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1);
        pokemon.setMod(Stat.DEFENSE, -1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Tickle => понижает атаку и защиту противника";
    }
}

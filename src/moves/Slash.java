package moves;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL, 70.0, 100.0);
    }

    @Override
    protected String describe() {
        return "использует Slash";
    }
}

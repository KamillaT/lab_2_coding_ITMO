import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Alomola alomola = new Alomola("Alomola", 1);
        Poliwrath poliwrath = new Poliwrath("Poliwrath", 1);
        b.addAlly(alomola);
        b.addFoe(poliwrath);
        b.go();
    }
}

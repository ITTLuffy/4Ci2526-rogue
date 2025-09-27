
public class Trinket extends Item implements Collectible {

    public Trinket() {
        super(0.0, 0.0);
    }

    @Override
    public boolean canDropped() {
        return true; // Solo i Trinket possono essere droppati
    }

}

import java.util.ArrayList;

public abstract class Room {

    protected Passive passive;
    protected ArrayList<Collectible> collectibles;

    public Room(Passive passive) { // costruttore
        // non posso istanziare, però posso usarlo con super nelle sottoclassi
        this.passive = passive;
        collectibles = new ArrayList<>();
    }

    public void identify() {
        System.out.println("I'm a room");
    }

    public ArrayList<Collectible> getCollectibles() {
        return collectibles;
    }

    public Passive getPassive() {
        return passive;
    }

    
}
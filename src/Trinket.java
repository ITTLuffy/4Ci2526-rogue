<<<<<<< HEAD
public class Trinket extends Item implements Collectible {
    
    public Trinket(String name, double damageMod, double fireMod){
        super(name, damageMod, fireMod);
    }

    @Override
    public boolean canDropped(){
        return true;
    }
=======

public class Trinket extends Item implements Collectible {

    
    public Trinket(String name, double damageMod, double fireMod) {
        super(name, damageMod, fireMod);
    }
    
    @Override
    public boolean canDropped() {
        return true; // Solo i Trinket possono essere droppati
    }

>>>>>>> e89c838728551693e45a3193eacc2d5bb8b1530c
}

public class Trinket extends Item implements Collectible {
    
    public Trinket(String name, double damageMod, double fireMod){
        super(name, damageMod, fireMod);
    }

    @Override
    public boolean canDropped(){
        return true;
    }
}

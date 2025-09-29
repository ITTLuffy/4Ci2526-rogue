public abstract class Item {
    
    protected String name;
    protected  double damageMod, fireMod;

    public Item(String name, double damageMod, double fireMod){
        this.name = name;
        this.damageMod = damageMod;
        this.fireMod = fireMod;
    }

    public double getDamageMod(){
        return damageMod;
    }

    public double getFireMod(){
        return fireMod;
    }
}

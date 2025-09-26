public class Active extends Item {
    protected int chargeLevel;
    protected final int MAX_CHARGE = 20;



    // MAX_CHARGE COME PARAMETRO???

    public Active(int chargeLevel, int damageMod, int fireMod) {
        super(damageMod, fireMod);
        this.chargeLevel = chargeLevel;
    }

    public boolean isLoaded() {
        // se è scarico
        if (chargeLevel < 0)
            return false;
        return true; // carico
    }
        
}

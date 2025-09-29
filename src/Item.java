/*Anche gli Item possiedono delle proprietà, che sono dei modificatori double alle 
statistiche: damageMod, fireMod, che vanno inizializzate dal costruttore.
 */

public abstract class Item {
    // ereditati da chi sta sotto
    protected String name;
    protected double damageMod, fireMod; // information hiding 

    // non servirebbe, dato che non può essere istanziata
    public Item(String name, double damageMod, double fireMod) {
        this.name = name;
        this.damageMod = damageMod;
        this.fireMod = fireMod;
    }

    // getter (incapsulamento)
    public double getDamageMod() {
        return damageMod;
    }

    public double getFireMod() {
        return fireMod;
    }

    
}

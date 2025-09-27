/*Anche gli Item possiedono delle proprietà, che sono dei modificatori double alle 
statistiche: damageMod, fireMod, che vanno inizializzate dal costruttore.
 */

public abstract class Item {

    private double damageMod;
    private double fireMod;

    public Item(double damageMod, double fireMod) {
        this.damageMod = damageMod;
        this.fireMod = fireMod;
    }

}

<<<<<<< HEAD
public abstract class Item {
    
    protected String name;
    protected  double damageMod, fireMod;

    public Item(String name, double damageMod, double fireMod){
=======
/*Anche gli Item possiedono delle proprietà, che sono dei modificatori double alle 
statistiche: damageMod, fireMod, che vanno inizializzate dal costruttore.
 */

public abstract class Item {
    // ereditati da chi sta sotto
    protected String name;
    protected double damageMod, fireMod; // information hiding 

    // non servirebbe, dato che non può essere istanziata
    public Item(String name, double damageMod, double fireMod) {
>>>>>>> e89c838728551693e45a3193eacc2d5bb8b1530c
        this.name = name;
        this.damageMod = damageMod;
        this.fireMod = fireMod;
    }

<<<<<<< HEAD
    public double getDamageMod(){
        return damageMod;
    }

    public double getFireMod(){
        return fireMod;
    }
=======
    // getter (incapsulamento)
    public double getDamageMod() {
        return damageMod;
    }

    public double getFireMod() {
        return fireMod;
    }

    
>>>>>>> e89c838728551693e45a3193eacc2d5bb8b1530c
}

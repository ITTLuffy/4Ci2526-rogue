// La classe Active possiede un attributo intero chargeLevel e 
// una costante maxCharge che indica il livello di carica attuale 
// e il livello di carica massimo dell'oggetto. Andrà aggiunto un metodo boolean isLoaded( ) 
// che restituisce l'attuale stato di carica dell'oggetto.

public class Active extends Item {

    protected int chargeLevel;
    protected final int MAX_CHARGE = 20;

    public Active(int chargeLevel, double damageMod, double fireMod) {
        super(damageMod, fireMod); // costruttore item
        this.chargeLevel = chargeLevel;
    }

    public boolean isLoaded() { // stato di carica
        return chargeLevel > 0;
    }

}

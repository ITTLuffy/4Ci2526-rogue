// La classe Active possiede un attributo intero chargeLevel e 
// una costante maxCharge che indica il livello di carica attuale 
// e il livello di carica massimo dell'oggetto. Andrà aggiunto un metodo boolean isLoaded( ) 
// che restituisce l'attuale stato di carica dell'oggetto.

public class Active extends Item {

    int chargeLevel;
    final int MAX_CHARGE;

    public Active(int maxCharge, String name, double damageMod, double fireMod) {
        super(name, damageMod, fireMod); // costruttore item
        MAX_CHARGE = maxCharge;
        chargeLevel = maxCharge;
    }

    public boolean isLoaded() { // stato di carica
        return chargeLevel == MAX_CHARGE;
    }

    public void reload() {
        chargeLevel = MAX_CHARGE;
    }

}

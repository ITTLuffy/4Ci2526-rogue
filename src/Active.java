<<<<<<< HEAD
public class Active extends Item {
    
    final int MAX_CHARGE;
    int chargeLevel;

    public Active(String name, double damageMod, int maxCharge){
        super(name, damageMod, maxCharge);

        MAX_CHARGE = maxCharge;
        chargeLevel = maxCharge;
    }
      
    public boolean isLoaded(){
        return chargeLevel == MAX_CHARGE;
    }

    public void reload(){
        chargeLevel = MAX_CHARGE;
    }
=======
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

>>>>>>> e89c838728551693e45a3193eacc2d5bb8b1530c
}

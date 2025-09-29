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
}

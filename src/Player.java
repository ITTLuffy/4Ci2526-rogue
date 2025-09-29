/*Il Player è dotato di alcune statistiche:
- gli interi hp, hpMax (quest'ultimo è una costante)
- i double baseDamage, finalDamage, baseFireRate, finalFireRate 
Il costruttore di Player prende come parametri solo i valori base delle statistiche. 
 */
import java.util.ArrayList;

public class Player {

    private Active active;
    private ArrayList<Passive> passive;
    private Trinket trinket;
    private ArrayList<Collectible> collectibles;
    private int hp;
    private final int HP_MAX;
    private double baseDamage, finalDamage, baseFireRate, finalFireRate;

    public Player(int hp, double baseDamage, double baseFireRate) {
        this.hp = this.HP_MAX = hp;
        this.baseDamage = baseDamage;
        this.baseFireRate = baseFireRate;
        passive = new ArrayList<>();
        collectibles = new ArrayList<>();
    }

    public double getFinalDamage() {
        return finalDamage;
    }

    public double getFinalFireRate() {
        return finalFireRate;
    }

    public void updateStats() {
        finalDamage = baseDamage;
        finalFireRate = baseFireRate;

        for (Passive p : passive) {
            finalDamage *= p.getDamageMod();
            finalFireRate *= p.getFireMod();
        }

        if (active != null) {
            finalDamage *= active.getDamageMod();
            finalFireRate *= active.getFireMod();
        }

        if (trinket != null) {
            finalDamage *= trinket.getDamageMod();
            finalFireRate *= trinket.getFireMod();
        }


    }




}

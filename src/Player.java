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
    private final int HP_MAX = 100; // Costante come richiesto
    private double baseDamage, finalDamage, baseFireRate, finalFireRate;

    public Player(int hp, double baseDamage, double baseFireRate) {
        this.hp = hp;
        this.baseDamage = baseDamage;
        this.baseFireRate = baseFireRate;
        this.finalDamage = baseDamage;
        this.finalFireRate = baseFireRate;
    }

}

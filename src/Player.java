<<<<<<< HEAD
public class Player {
    
}
=======
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

        if (active != null && active.isLoaded()) {
            finalDamage *= active.getDamageMod();
            finalFireRate *= active.getFireMod();
        }

        if (trinket != null) { // bisogna controllare le istanze
            finalDamage *= trinket.getDamageMod();
            finalFireRate *= trinket.getFireMod();
        }
    }

    public void viewStats() {
        System.out.printf("Hp: %d, danno corrente %.2f, fire rate: %.2f \n", hp, finalDamage, finalFireRate);
    }

    public void addItem(Item nuovo) {
        if (nuovo instanceof Passive)
            passive.add((Passive)nuovo);
        else if(nuovo instanceof Active)
            this.active = (Active)nuovo;
        else if(nuovo instanceof Trinket)
            this.trinket = (Trinket)nuovo;
    }

    public Trinket dropTrinket() {
        if (this.trinket == null) return null;

        Trinket temp = this.trinket;
        this.trinket = null;
        return temp;
    }

    public boolean checkCollectibles() {
        boolean trovati = false;

        for (int i = collectibles.size() - 1; i >= 0; i--) { // NON POSSO USARE IL FOR EACH
            
            if (collectibles.get(i) instanceof Trinket) {
                collectibles.remove(i);
                trovati = true;
            }
        }
        return trovati;
    }

}
>>>>>>> e89c838728551693e45a3193eacc2d5bb8b1530c

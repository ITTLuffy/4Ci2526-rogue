public class App {
    public static void main(String[] args) throws Exception {
        // TEST
        
        Player p = new Player(10, 10, 1);

        Passive passive1 = new Passive("nonloso",1.5, 1.2);
        p.addItem(passive1);

        Active active1 = new Active(3, "nonnehoidea",2.0, 0.8);
        p.addItem(active1);

        Trinket trinket1 = new Trinket("boh",1.1, 1.1);
        p.addItem(trinket1);

        p.viewStats();
        System.out.println("\n--- Prima ---");

        p.updateStats();
        p.viewStats();

        System.out.println("\n--- Drop trinket ---");
        p.dropTrinket();
        p.updateStats();
        p.viewStats();

    }
}

public class BossRoom extends Room{
    public BossRoom(Passive passive) {
        super(passive);
    }

    @Override
    public void identify() {
        System.out.println("I'm a boss room");
    }

    
    
}
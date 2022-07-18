package character;

public class Character {
    private int health;
    private int shield;
    private String name;

    private int attack;

    public Character(int health, int shield, String name){
        super();
        this.health = health;
        this.shield = shield;
        this.name = name;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth() {
        return 0;
    }

    public void getShield(Character attacker) {}

    public String getName() {
        return name;
    }

    public int getAttack() {return 0;}

    public void recievedDamage(int amountOfDamage){ }

    public void modAttack(Character defender){ }

    public void resetAlter(){ }

}

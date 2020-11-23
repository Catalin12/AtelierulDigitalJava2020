package lab2.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health=health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter op) {
        op.health = op.health - this.damagePerAttack;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
}

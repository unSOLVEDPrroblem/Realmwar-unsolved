package FinalProject.models.Units;

public abstract class Units {
    protected int health;
    protected int attackPower;


    public Units(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }


    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public int getAttackPower() {
        return attackPower;
    }


    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }


    public abstract void attack(Units target);
}

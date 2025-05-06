package FinalProject.models.Structures;

public abstract class Structures {

    protected int health;
    protected int cost;
    protected int level;


    public Structures(int health, int cost, int level) {
        this.health = health;
        this.cost = cost;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public abstract void displayInfo();
}


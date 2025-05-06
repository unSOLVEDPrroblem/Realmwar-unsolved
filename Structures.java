package FinalProject;

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


class TownHall extends Structures {


    public TownHall(int health, int cost, int level) {
        super(health, cost, level);
    }

    @Override
    public void displayInfo() {

    }
}
class Barrack extends Structures {


    public Barrack(int health, int cost, int level) {
        super(health, cost, level);
    }

    @Override
    public void displayInfo() {

    }
}
class Farm extends Structures {


    public Farm(int health, int cost, int level) {
        super(health, cost, level);
    }

    @Override
    public void displayInfo() {

    }
}

class Market extends Structures {


    public Market(int health, int cost, int level) {
        super(health, cost, level);
    }

    @Override
    public void displayInfo() {

    }
}

class Tower extends Structures {


    public Tower(int health, int cost, int level) {
        super(health, cost, level);
    }

    @Override
    public void displayInfo() {

    }
}

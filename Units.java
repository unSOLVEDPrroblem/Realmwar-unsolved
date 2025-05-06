package FinalProject;

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

//**  زیر کلاس ها **

class Knight extends Units {
    public Knight(int health, int attackPower) {
        super(health, attackPower);
    }

    @Override
    public void attack(Units target) {
    }
}

class Peasant extends Units {
    public Peasant(int health, int attackPower) {
        super(health, attackPower);
    }

    @Override
    public void attack(Units target) {
    }
}

class Spearman extends Units {
    public Spearman(int health, int attackPower) {
        super(health, attackPower);
    }

    @Override
    public void attack(Units target) {
    }
}

class Swordman extends Units {
    public Swordman(int health, int attackPower) {
        super(health, attackPower);
    }

    @Override
    public void attack(Units target) {
    }
}





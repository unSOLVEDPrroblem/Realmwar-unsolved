package FinalProject;

abstract class Blocks {
    protected String type;

    public String getType() {
        return type;
    }
    public abstract void interact();
}

class EmptyBlock extends Blocks {
    public EmptyBlock() {
        this.type = "Empty Block";
    }
    @Override
    public void interact() {

    }
}

class ForestBlock extends Blocks {
    public ForestBlock() {
        this.type = "Forest Block";
    }
    @Override
    public void interact() {

    }
}

class VoidBlock extends Blocks {
    public VoidBlock() {
        this.type = "Void Block";
    }
    @Override
    public void interact() {}
}

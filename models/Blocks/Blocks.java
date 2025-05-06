package FinalProject.models.Blocks;

abstract class Blocks {
    protected String type;

    public String getType() {
        return type;
    }
    public abstract void interact();
}

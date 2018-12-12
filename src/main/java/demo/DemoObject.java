package demo;

public class DemoObject {

    public final long creationTime = System.nanoTime();

    public final int id;

    public DemoObject(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DemoObject with id " + id + " was created at time point " + creationTime;
    }
}

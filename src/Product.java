public abstract class Product {
    static int count = 0;
    protected int id = ++count;
    protected String name;
    protected double weight;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

public class Toy extends Product{

    public Toy(String name, double weight) {
        this.id = super.getId();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d. ������� \" %s\", ���: %.2f�", id, name,weight);
    }
}

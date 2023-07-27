import java.util.List;

public class Toy extends Product implements Comparable<Toy>{

    public Toy(String name, double weight) {
        this.id = super.getId();
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d. ������� \" %s\", ���: %.2f�", id, name,weight);
    }

    @Override
    public int compareTo(Toy o) {
        return Double.compare(this.weight, o.weight);
    }
}

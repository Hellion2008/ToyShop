import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Toy toy = new Toy("�����", 50.5);
        Product toy2 = new Toy("�������", 100.2);
        System.out.println(toy);
        System.out.println(toy2);

        Shop<Toy> toys = new Shop<>();
        System.out.println(toys.getProducts().size());
        toys.addProduct(toy);
        System.out.println(toys.getProducts().size());
    }
}

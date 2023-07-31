import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"�����", "�������", "�������", "������ �������", "�����"};

        Shop<Product> shop = new Shop<>();
        for (int i = 0; i < 10; i++){
            shop.addProduct(
                    new Toy(names[random.nextInt(0, names.length-1)],
                            random.nextDouble(20, 100))
            );
        }
//        shop.addProduct(new Toy("�������", 50.2));
//        shop.addProduct(new Toy("�����", 100.2));
//        shop.addProduct(new Toy("�������", 15.2));
//        shop.addProduct(new Toy("�������", 45.3));
//        shop.addProduct(new Toy("�������", 12.2));
//        shop.addProduct(new Toy("�����", 78.2));
//        shop.addProduct(new Toy("�������", 25.2));
//        shop.addProduct(new Toy("�������", 15.5));
//        shop.addProduct(new Toy("�����", 54.2));
//        shop.addProduct(new Toy("�������", 53.2));
        System.out.println("�������������� ����: ");
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }
        System.out.println();

        System.out.print("����: ");
        shop.showPresent();
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }

    }
}

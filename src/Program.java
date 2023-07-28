import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
//        Toy toy = new Toy("�����", 50.5);
//        Product toy2 = new Toy("�������", 100.2);
        String[] names = {"�����", "�������", "�������", "������ �������", "�����"};
//        System.out.println(toy);
//        System.out.println(toy2);

        Shop<Product> shop = new Shop<>();
        for (int i = 0; i < 10; i++){
            shop.addProduct(
                    new Toy(names[random.nextInt(0, names.length-1)],
                            random.nextDouble(20, 100)));
        }
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }
        System.out.println("����: " + shop.showPresent());
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }

    }
}

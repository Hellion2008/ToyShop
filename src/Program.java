import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
//        Toy toy = new Toy("Робот", 50.5);
//        Product toy2 = new Toy("Машинка", 100.2);
//        String[] names = {"Робот", "Машинка", "Мозаика", "Мягкая игрушка", "Кукла"};
//        System.out.println(toy);
//        System.out.println(toy2);

        Shop<Product> shop = new Shop<>();
//        for (int i = 0; i < 10; i++){
//            shop.addProduct(
//                    new Toy(names[random.nextInt(0, names.length-1)],
//                            random.nextDouble(20, 100))
//            );
//        }
        shop.addProduct(new Toy("Машинка", 50.2));
        shop.addProduct(new Toy("Робот", 100.2));
        shop.addProduct(new Toy("Мозаика", 15.2));
        shop.addProduct(new Toy("Машинка", 45.3));
        shop.addProduct(new Toy("Машинка", 12.2));
        shop.addProduct(new Toy("Кукла", 78.2));
        shop.addProduct(new Toy("Мозаика", 25.2));
        shop.addProduct(new Toy("Мозаика", 15.2));
        shop.addProduct(new Toy("Кукла", 54.2));
        shop.addProduct(new Toy("Машинка", 53.2));
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }
        System.out.println("ПРИЗ: " + shop.showPresent());
        for (Product el: shop.getProducts()){
            System.out.println(el);
        }

    }
}

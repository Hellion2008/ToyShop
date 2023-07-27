import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class Shop <T extends Product>{
    private ArrayList<T> products = new ArrayList<>();

    public ArrayList<T> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<T> products) {
        this.products = products;
    }

    public void addProduct(T product){
        products.add(product);
    }

    private double totalWeight(){
        double weight = 0;
        for (T p: products){
            weight += p.getWeight();
        }
        return weight;
    }

    public PriorityQueue<T> generateQueue(int elementCount){
        PriorityQueue<T> queue = new PriorityQueue<>(elementCount);
        Random random = new Random();
        for (int i = 0; i < queue.size(); i++){
            int index = random.nextInt(0, products.size()-1);
            queue.add(products.get(index));
            products.remove(index);
        }
        return queue;
    }
}

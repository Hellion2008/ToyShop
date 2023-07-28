import java.util.*;

public class Shop <T extends Product>{
    private ArrayList<T> products = new ArrayList<>();

    public ArrayList<T> getProducts() {
        return products;
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

    private Map<String, Double> totalWeightsOfToyName(){
        double weight = 0;
        Map<String, Double> map = new HashMap<>();
        for (T el: products){
            if (map.containsKey(el.getName())){
                map.put(el.getName(), map.get(el.getName()) + el.getWeight());
            } else {
                map.put(el.getName(), el.getWeight());
            }
        }
        return map;
    }

    private double randomWeight(String name){
        return 100 * totalWeightsOfToyName().get(name)/totalWeight();
    }

    public T showPresent(){
        Random random = new Random();
        Set<T> presents = new HashSet<>();
        for (T el: products){
            presents.add(el);
        }
        double winNumber = random.nextDouble();
        while (true){
            for (T el: presents){
                if (winNumber < randomWeight(el.getName())){
                    products.remove(el);
                    return el;
                }
            }
        }
    }


//    public PriorityQueue<T> generateQueue(int elementCount){
//        PriorityQueue<T> queue = new PriorityQueue<>(elementCount);
//        Random random = new Random();
//        for (int i = 0; i < queue.size(); i++){
//            int index = random.nextInt(0, products.size()-1);
//            queue.add(products.get(index));
//            products.remove(index);
//        }
//        return queue;
//    }

//    public Product presentForWinner(){
//        for (T el: prod)
//        return null;
//    }
}

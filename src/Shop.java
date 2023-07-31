import java.io.FileWriter;
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

    private SortedMap<Double,String> sortedMap(){
        SortedMap<String, Double> map = new TreeMap<>();
        for (T el: products){
            if (map.containsKey(el.getName())){
                map.put(el.getName(), map.get(el.getName()) + el.getWeight());
            } else {
                map.put(el.getName(), el.getWeight());
            }
        }
        SortedMap<Double,String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Double> el: map.entrySet()){
            sortedMap.put(el.getValue(), el.getKey());
        }
        return sortedMap;
    }

    public void showPresent(){
        Random random = new Random();
        SortedMap<Double, String> map = sortedMap();

        double winNumber = random.nextDouble(0, totalWeight());
        while (true){
            double temp = 0;
            for (Map.Entry<Double, String> el: map.entrySet()){
                temp += el.getKey();
                if (winNumber <= temp){
                    prizeSelection(el.getValue());
                    return;
                }
            }
        }
    }

    private void prizeSelection(String nameProduct){
        for (T el: products){
            if (el.getName().equalsIgnoreCase(nameProduct)){
                saveToFile(el);
                products.remove(el);
                return;
            }
        }
    }

    private void saveToFile(T product){
        try(FileWriter fileWriter = new FileWriter("presents.txt", true)){
            fileWriter.write(product.toString() + "\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
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

//    private Map<String, Double> totalWeightsOfToyName(){
//        Map<String, Double> map = new HashMap<>();
//        for (T el: products){
//            if (map.containsKey(el.getName())){
//                map.put(el.getName(), map.get(el.getName()) + el.getWeight());
//            } else {
//                map.put(el.getName(), el.getWeight());
//            }
//        }
//        return map;
//    }
}

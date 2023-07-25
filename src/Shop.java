import java.util.ArrayList;

public class Shop <T extends Product>{
    private ArrayList<T> products = new ArrayList<>();

    public ArrayList<T> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<T> products) {
        this.products = products;
    }
}

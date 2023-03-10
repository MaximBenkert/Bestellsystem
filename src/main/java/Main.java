import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Hose", 1);
        Product p2 = new Product("T-Shirt", 2);

        List <Product> myProducts = new ArrayList<>();
        myProducts.add(p1);
        myProducts.add(p2);

        System.out.println(myProducts.get(0));
        System.out.println("______________");
        ProductRepo myRepo = new ProductRepo(myProducts);

        System.out.println(myRepo);



    }
}

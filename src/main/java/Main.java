import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Hose", 1);
        Product p2 = new Product("T-Shirt", 2);
        Product p3 = new Product("Pullover", 3);

        List <Product> myProducts = new ArrayList<>();
        myProducts.add(p1);
        myProducts.add(p2);
        myProducts.add(p3);

        ProductRepo myProductRepo = new ProductRepo(myProducts);
        System.out.println(myProductRepo.getProductbyId(1));
        System.out.println("*********");
        myProductRepo.listProducts();

        System.out.println("______________");

        Order o1 = new Order(1, myProducts);
        Order o2 = new Order (2, myProducts);
        Order o3 = new Order(3, myProducts);
        List <Order> myOrders = new ArrayList<>();
        myOrders.add (o2);
        myOrders.add (o1);
        System.out.println(myOrders);

        System.out.println("................");

        OrderRepo myOrderRepo = new OrderRepo(myOrders);

        myOrderRepo.getOrderById(1);
        myOrderRepo.listProducts();

        myOrderRepo.addOrder(o3);










    }
}

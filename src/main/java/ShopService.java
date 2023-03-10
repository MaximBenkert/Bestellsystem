import java.util.Objects;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    //LEERER KONSTRUKTOR
    public ShopService() {
    }

    //KONSTRUKTOR


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(productRepo, that.productRepo) && Objects.equals(orderRepo, that.orderRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productRepo, orderRepo);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }

    public Product getProduct(int id){
        return productRepo.getProductbyId(id);
    }

    public Order getOrder (int id){
        return orderRepo.getOrderById(id);
    }

    public void listProducts (){
        productRepo.listProducts();
    }
    public void listOrders(){
        orderRepo.listProducts();
    }
    public void addOrders(Order order){
        orderRepo.addOrder(order);
    }



}

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class OrderRepo {
    private List<Order> orders;

    public OrderRepo() {
    }

    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    public Order getOrderById(int OrderId) {
        for (Order o : orders) {
            if (OrderId == o.getOrderId()) {
                return o;
            }
        }
        throw new NoSuchElementException();
    }

    public List<Order> listProducts() {
        for (Order o : orders) {
            System.out.println(o);
        }
        return orders;
    }

    public boolean addOrder(Order order) {
        if (orders.contains(order)){
            return false;
        }
        orders.add(order);
        return true;
    }

}




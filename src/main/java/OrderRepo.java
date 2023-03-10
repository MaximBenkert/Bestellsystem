import java.util.List;
import java.util.NoSuchElementException;





    public class OrderRepo {
        private List<Order> orders;

        public OrderRepo(List<Order> orders) {
            this.orders = orders;
        }


        public Order getOrderById  (int OrderId){
            for (Order o: orders){
                if (OrderId == o.getOrderId()) {
                    return o;
                }
            }
            throw new NoSuchElementException();
        }



        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }
    }



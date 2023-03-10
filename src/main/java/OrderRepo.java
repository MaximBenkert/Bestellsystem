import java.util.List;

public class OrderRepo {

    import java.util.List;

    public class OrderRepo {
        private List<Order> orders;

        public OrderRepo() {
        }

        public Order getOrderById (int OrderId, List<Order> orders){
            for (Order : orders ){
                if (OrderId == ) {
                    return orders.get(OrderId);
                }
            }
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
    }

}

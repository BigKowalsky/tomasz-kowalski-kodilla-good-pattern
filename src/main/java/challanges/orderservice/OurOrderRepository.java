package challanges.orderservice;

public class OurOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        return false;
    }
}

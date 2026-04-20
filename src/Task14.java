public class Task14 {
    public static void main(String[] args) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus + " is active? " + orderStatus.isActive());
        }
    }
}

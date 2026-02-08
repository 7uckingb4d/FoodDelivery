public class Customer {
    private String customerName;
    private Order order;

    public Customer(String customerName, Order order) {
        this.customerName = customerName;
        this.order = order;
    }

    public String placeOrder() {
        return customerName + " placed an order worth P" + order.calculateTotal();
    }

    public String identifyRole() {
        return "I am the Customer class. I place orders in the food delivery system.";
    }
}
package foodDelieveryApp;
public class FoodDelivery {
      
    public static void main(String[] args) {

        FoodItem food = new FoodItem("Burger", 120.00);
        Order order = new Order(101, food);
        Customer customer = new Customer("Alex", order);

        System.out.println(
            food.identifyRole() + "\n" +
            order.identifyRole() + "\n" +
            customer.identifyRole() + "\n" +
            customer.placeOrder()
        );
    }
}
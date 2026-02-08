public class Order {

private int orderId;

private FoodItem foodItem;



public Order(int orderId, FoodItem foodItem) {

this.orderId = orderId;

this.foodItem = foodItem;

}



public double calculateTotal() {
return foodItem.getPrice();
}



public String identifyRole() {

return "I am the Order class. I manage order details and calculate totals.";

}

}
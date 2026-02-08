public class FoodItem{

private String foodName;
private double price;



public FoodItem(String foodName, double price) {

this.foodName = foodName;

this.price = price;

}

public double getPrice() {

return price;

}


public String identifyRole() {

return "I am the FoodItem class. I represent a food product in an order.";

}

}

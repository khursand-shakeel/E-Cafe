import java.util.ArrayList;


public class Order {

	private ArrayList<FoodItem> foodItems;
	private int orderId;
	
	Order(ArrayList<FoodItem> foodItems, int orderId){
		this.foodItems = foodItems;
		this.orderId = orderId;
	}
	
	public ArrayList<FoodItem> getFoodItems(){
		return this.foodItems;
	}
}

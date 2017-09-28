
public class FoodItem {

	private String name;
	private int price;
	private String category; 
	private static int id;
	
	FoodItem(int id, String name, int price, String category){
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	} 
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public String getCategory(){
		return this.category;
	}
	
	public int getId(){
		return this.id;
	}
}

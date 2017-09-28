import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

	private static FoodItem[] appetizers;
	private static FoodItem[] soups;
	private static FoodItem[] mainCourses;
	private static FoodItem[] sideDishes;
	private static ArrayList<FoodItem> foodItems;
	private static ArrayList<Order> orders;
	private static int orderCount = 0;
	
	public static void main(String[] args) {

		initializeItems();
		displayMenu();
		intializeFoodItemsList();
		takeOrder();

		System.out.println("Please select the delivery method:\n1: Home Delivery\n2: Pick-up");
		Scanner input = new Scanner(System.in);

		String deliveryAddress = null;
		
		switch(input.nextInt()){
		
		case 1:{
			System.out.println("Please enter the delivery address:");
			deliveryAddress = input.nextLine();
		}
		
		case 2:{
			
		}
		}
		
	}
	
		
	private static void initializeItems(){
		
		int id = 1;
		appetizers = new FoodItem[4];
		for (int i = 0, j = 10; i < 4; i++, id++){
			appetizers[i] = new FoodItem(id, "Appetizer " + (i + 1), i + j, "appetizer");
			j += 5;
		}
		
		soups = new FoodItem[2];
		for (int i = 0, j = 10; i < 2; i++){
			soups[i] = new FoodItem(id, "Soup " + (i + 1), i + j, "soup");
			j += 5;
		}
		
		mainCourses = new FoodItem[6];
		for (int i = 0, j = 10; i < 6; i++){
			mainCourses[i] = new FoodItem(id, "Main Course " + (i + 1), i + j, "mainCourse");
			j += 5;
		}
		
		sideDishes = new FoodItem[3];
		for (int i = 0, j = 10; i < 3; i++){
			sideDishes[i] = new FoodItem(id, "Side Dish " + (i + 1), i + j, "sideDishe");
			j += 5;
		}
		
	}

	private static void displayMenu(){
		System.out.println("APPETIZERS\n");
	    System.out.println("ID\tName\t\tPrice");
	    for (int i = 0; i < 4; i++){
	    	System.out.print(appetizers[i].getId() + "\t" + appetizers[i].getName() + "\t" + appetizers[i].getPrice() + "\n");
	    }
	    System.out.println();
	    
	    System.out.println("SOUPS\n");
	    System.out.println("ID\tName\tPrice");
	    for (int i = 0; i < 2; i++){
	    	System.out.print(soups[i].getId() + "\t" + soups[i].getName() + "\t" + soups[i].getPrice() + "\n");
	    }
		System.out.println();
		
		System.out.println("MAIN COURSES\n");
	    System.out.println("ID\tName\t\tPrice");
	    for (int i = 0; i < 2; i++){
	    	System.out.print(mainCourses[i].getId() + "\t" + mainCourses[i].getName() + "\t" + mainCourses[i].getPrice() + "\n");
	    }
		System.out.println();
		
		System.out.println("SIDE DISHES\n");
	    System.out.println("ID\tName\t\tPrice");
	    for (int i = 0; i < 2; i++){
	    	System.out.print(sideDishes[i].getId() + "\t" + sideDishes[i].getName() + "\t" + sideDishes[i].getPrice() + "\n");
	    }
		System.out.println();
	}
	
	private static void intializeFoodItemsList(){
		foodItems = new ArrayList<FoodItem>();
				
		for (int i = 0; i <4; i++){
			foodItems.add(appetizers[i]);
		}
		
		for (int i = 0; i <2; i++){
			foodItems.add(soups[i]);
		}
		
		for (int i = 0; i <6; i++){
			foodItems.add(mainCourses[i]);
		}
		
		for (int i = 0; i <3; i++){
			foodItems.add(sideDishes[i]);
		}
		
	}
	
	private static void takeOrder(){
		Scanner input = new Scanner(System.in);
		
		int id = 0;
		orders = new ArrayList<Order>();
		ArrayList<FoodItem> foodList = new ArrayList<FoodItem>();
		int itemCount = 0;
		
		while(true){
			System.out.print("Please select an item from the menu. Enter its ID to select: ");
			id = input.nextInt();
			if (id == 0){
				break;
			}
			foodList.add(foodItems.get(id - 1));
			itemCount++;
			System.out.println(foodItems.get(id - 1).getName() + " added to your order.");
					
		}
		orders.add(new Order(foodList, itemCount + 1));
		orderCount++;
		
		System.out.println("\nHere's your total bill:\n");
		System.out.println("Item\t\tPrice\n");
		for (int k = 0; k < orders.size(); k++){
			//System.out.println(orders.get(k).getName() + "\t" + orders.get(k).getPrice());
			//System.out.println(orders.get(k).getFoodItem().getName() + "\t" + orders.get(k).getFoodItem().getPrice());
			System.out.println(orders.get(k).getFoodItems().get(k).getName() + "\t" + orders.get(k).getFoodItems().get(k).getPrice());


		}
		
		System.out.println("\n");
		int totalAmount = 0;
		for (int k = 0; k < orders.size(); k++){
			//totalAmount += orders.get(k).getPrice();
			totalAmount += orders.get(k).getFoodItems().get(k).getPrice();
		}
		System.out.println("Total\t\t" + totalAmount);
	}
	/*private static void initializeIds(){
		ids = new ArrayList<Integer>();
		
		for (int i = 0; i < 15; i++){
			ids.add(i);
		}
		
	}*/
}

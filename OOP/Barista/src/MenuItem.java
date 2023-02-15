
public class MenuItem {
	private String name;
	private double price;
	
	//constructor
	// Takes a name and price as arguments and sets them accordingly
	public MenuItem(String name, double price){
		this.name = name;
	    this.price = price;
	}
	
	//getter
	public String getName(){
		return name;
	}
	
	//setter
	public void setName(String itemName){
		this.name = itemName;
	}
		
	//getter
	public double getPrice() {
		return price;
	}
	
	//setter
	public void setPrice(double orderPrice) {
		this.price = orderPrice;
	}
}

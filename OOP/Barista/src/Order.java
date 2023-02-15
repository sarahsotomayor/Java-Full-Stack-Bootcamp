import java.util.ArrayList;
public class Order {
	private String name;
	private boolean ready;
	private ArrayList<MenuItem>items;
	
	//constructor
	public Order(){
		this.name = "Guest";
	    this.items = new ArrayList<MenuItem>();
	}
	
	//overloaded constructor
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<MenuItem>();
	}
	
	//getters & setters
	
	//getter
	public String getCustomerName(){
			return name;
		}
		
	//setter
	public void setCustomerName(String customerName){
			this.name = customerName;
		}
	
	//getter
	public ArrayList<MenuItem>getOrderList(){
			return new ArrayList<MenuItem>(items);
		}
		
	//setter
	public void setOrderList(ArrayList<MenuItem>items){
			this.items = items;
		}
	
	//getter
	public boolean getReady() {
		return ready;
	}
	
	//setter
	public void setReady(boolean ready) {
		this.ready = ready;
	}

	
	//methods
    public void addItem(MenuItem item){
        items.add(item);
    }
    
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting, your order will be ready soon.";
    }

    public double getOrderTotal(){
        double total = 0;
        for(MenuItem item : items){
            total += item.getPrice();
        }
        return total;
    }
    
	public void displayOrder(){
		System.out.println("Customer Name: "+this.name);
	    for(MenuItem item : items){
	    	System.out.println(item.getName()+" - $"+item.getPrice());
	    }
	    System.out.println("Total: $"+getOrderTotal());
	}
	
}

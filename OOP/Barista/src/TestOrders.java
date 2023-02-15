
public class TestOrders {
    public static void main(String[] args) {
    	
    	//menu items
    	MenuItem coffee1 = new MenuItem("mocha", 4.00);	
    	
    	MenuItem coffee2 = new MenuItem("cappuccino", 3.00);
    	
    	MenuItem coffee3 = new MenuItem("espresso shot", 1.50);

    	//orders
    	Order order3 = new Order("Snorlax");
    	order3.addItem(coffee1);
    	order3.addItem(coffee3);
    	order3.displayOrder();
    	
    	Order order4 = new Order("Psyduck");
    	order4.addItem(coffee2);
    	order4.addItem(coffee3);
        order4.displayOrder();
        
        //status
        System.out.println(order3.getStatusMessage());
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        //order total
        System.out.println(order4.getOrderTotal());
        order4.displayOrder();

    }
}
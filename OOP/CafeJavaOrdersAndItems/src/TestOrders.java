public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    	MenuItem coffee1 = new MenuItem();
    	coffee1.name = "mocha";
    	coffee1.price = 5.50;
    	
    	MenuItem coffee2 = new MenuItem();
    	coffee2.name = "latte";
    	coffee2.price = 4.00;
    	
    	MenuItem coffee3 = new MenuItem();
    	coffee3.name = "cappuccino";
    	coffee3.price = 3.50;
    	
    	MenuItem coffee4 = new MenuItem();
    	coffee4.name = "drip coffee";
    	coffee4.price = 2.00;
    	
    	MenuItem coffee5 = new MenuItem();
    	coffee5.name = "espresso shot";
    	coffee5.price = 1.00;
    						
        // Order variables -- order1, order2 etc.
    	Order order1 = new Order();
    	order1.name = "Snorlax";
    			
    	Order order2 = new Order();
    	order2.name = "Psyduck";
    			
    	Order order3 = new Order();
    	order3.name = "Pikachu";
    			
    	Order order4 = new Order();
    	order4.name = "Eevee";
    	
    
        // Application Simulations
    	 order2.items.add(coffee1);
         order2.total += coffee1.price;
         
         order1.items.add(coffee4);
         order1.items.add(coffee4);
         order1.total += coffee4.price * 2;
         
         order1.ready = true;
         
         order3.items.add(coffee2);
         order3.total += coffee2.price;
    	
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    }
}
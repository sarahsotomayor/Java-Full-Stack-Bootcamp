import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int weeks = 1; weeks <= 10; weeks++){
            sum = sum + weeks;
            System.out.println(sum);
        }
        return sum;
    }


    public double getOrderTotal(double [] lineItems) {
        double sum = 0;
        for (double price: lineItems){
            sum += price;
        }
        return sum;
    }


    public void displayMenu(ArrayList<String> menu) {
        for(int coffee = 0; coffee < menu.size(); coffee++){
            System.out.println(menu.get(coffee));
        }
    /*Note: different way of doing this:
        public void displayMenu(ArrayList<String> menuItems) {
        for (int id = 0; id < menuItems.size(); id++) {
        System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }
     */
    }


    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please Enter Your Name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
            System.out.println("There are " + customers.size() + " people in front of you.");
            customers.add(userName);
            System.out.println(customers);
    /*Note: different way to do line 34 & 35:
    System.out.printf("Hello, %s! ", userName);
    System.out.printf("There are %s people ahead of you.\n", customerList.size());
    */
}


/*
    BONUSES TO LEARN HOW TO DO:
        // Price chart
    // Ninja bonus: Format for currency
    // https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    public void printPriceChart(String productName, double price, int maxQuantity) {

        System.out.printf("%s\n", productName);
        for(int quantity = 1; quantity < maxQuantity; quantity++) {
            System.out.printf("%s - $%.2f\n", quantity, quantity * price);
        }
        
        System.out.println("");
    }

        // Display Coffee Menu
    // https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> priceIndex) {
        if(menuItems.size() != priceIndex.size()) {
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s -- $%.2f \n", id, menuItems.get(id), priceIndex.get(id));
        }
        return true;
    }

        /* Sensei bonus:
    Make a method addCustomers where a barista can enter multiple customers. 
    Hint: You can use a while loop and ask the user to type q when they are finished entering names.

    public void addCustomers(ArrayList<String> customerList) {
        boolean finished = false;
        String input;
        while (!finished) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = System.console().readLine();
            if (input.equals("Q")) {
                finished = true;
                return;
            }
            customerList.add(input);
            System.out.printf("%s was added to the list.", input);
            System.out.println(customerList);
        }
    }

}
 */

}

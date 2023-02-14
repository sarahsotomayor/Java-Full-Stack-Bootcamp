public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 5.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.5;

        // Customer name variables (add yours below)
        String customer1 = "Snorlax";
        String customer2 = "Pikachu";
        String customer3 = "Clefairy";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + readyMessage + displayTotalMessage + mochaPrice);
        
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice * 2));
        if (isReadyOrder3) {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (mochaPrice - lattePrice));
    }
}
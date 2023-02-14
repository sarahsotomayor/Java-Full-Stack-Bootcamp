import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);    }
    
    // Inputs: None
    // Return Type: String
    // Output: Returns an announcement of the current date, 
    //         in a polite manner.
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    // Inputs: String (Any phrase)
    // Return Type: String
    // Output: A repsonse (String)
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

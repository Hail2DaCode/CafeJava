public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready,";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 2.50;
        double dripCoffeePrice = 7.50;
        double lattePrice = 1.50;
        double cappucinoPrice = 9.50;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // String customer = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(isReadyOrder1?  customer1 +readyMessage: customer1 + pendingMessage);
        if (isReadyOrder4) {
            System.out.println( customer4+readyMessage + " " + displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println( customer4 + pendingMessage);
        }
        System.out.println(displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println( customer2 +readyMessage + " " + displayTotalMessage + " "+ 2*lattePrice);
        }
        else {
            System.out.println(  customer2 + pendingMessage);

        }
        if (lattePrice > dripCoffeePrice) {
        System.out.println(displayTotalMessage + (lattePrice-dripCoffeePrice));
        }
        else {
        System.out.println("We undercharged you, " + displayTotalMessage + (dripCoffeePrice-lattePrice));

        }
        switch(customer4) {
            case "Jimmy":
                System.out.println( generalGreeting + customer3);
                if (isReadyOrder3) {
                System.out.println( customer3 +readyMessage + " " + displayTotalMessage + " "+ mochaPrice);
                }
                else {
                    System.out.println(customer3 + pendingMessage);
                }
                break;
            case "Cindhuri":
                System.out.println( generalGreeting + customer1);
                if (isReadyOrder1) {
                System.out.println( customer1 +readyMessage + " " + displayTotalMessage + " "+ cappucinoPrice);
                }
                else {
                    System.out.println(customer1 + pendingMessage);
                }
                break;
            case "Sam":
                System.out.println( generalGreeting + customer2);
                if (isReadyOrder2) {
                System.out.println( customer2 +readyMessage + " " + displayTotalMessage + " "+ lattePrice);
                }
                else {
                    System.out.println(customer2 + pendingMessage);
                }
                break;
            case "Noah":
                System.out.println( generalGreeting + customer4);
                if (isReadyOrder4) {
                System.out.println( customer4 +readyMessage + " " + displayTotalMessage + " "+ dripCoffeePrice);
                }
                else {
                    System.out.println(customer4 + pendingMessage);
                }
                break;
            default:
            System.out.println("Hello World!" );

                
        }

    }
}

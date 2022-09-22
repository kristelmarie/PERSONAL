
// import the Scanner class
import java.util.Scanner;

public class App {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    /**
     * 
     */
    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
    
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }


       
        scan.nextLine();

        System.out.println("Please select the type of crust:");
        System.out.println("Enter HTC if you want a Hand Tossed Crust");
        System.out.println("Enter TC if you want a Thin Crust");

        System.out.print("Type of crust? ");
        String type = "";

        String kind = scan.next();
        scan.nextLine();

        switch (kind) {
            case "HTC":
                type = "Hand Tossed Crust";
                break;
            case "TC":
                type = "Thin Crust";
                break;
            default:
            System.out.println("Invalid Order");
            return;
        }


        System.out.println("Please select pizza size:");
        System.out.println("Type M for a 9-inch pizza");
        System.out.println("Type F for a 12-inch pizza");
        System.out.println("Type B for a 14-inch pizza");
       
        System.out.println("Choose pizza size: ");

        //String size = scan.next();
        //scan.nextLine();

        String size = "";
        char inch = scan.next().charAt(0);
        switch (inch) {
            case 'M':
            size = "9-inch pizza";
            //System.out.println("9-inch pizza");
            case 'F':
            size = "12-inch pizza";
            //System.out.println("12-inch pizza");
            case 'B':
            size = "14-inch pizza";
            //System.out.println("14-inch pizza");
            //return;
        }


        System.out.print("Enter the quantity: ");
        int quantity = scan.nextInt();



        System.out.println("Your order is: " + quantity + " " + type + " " + size + " " + pizza);
        System.out.println("Your total amount is: " + (quantity*price));

        scan.close();
    }
}

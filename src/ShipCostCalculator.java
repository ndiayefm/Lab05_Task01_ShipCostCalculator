import java.util.Scanner;



public class ShipCostCalculator {

    static void main() {

        // Create a Scanner object for console input

        Scanner in = new Scanner(System.in);



        // Declare variables for price, shipping cost, and total cost

        double itemPrice = 0;

        double shippingCost = 0;

        double totalCost = 0;



        // Prompt the user to enter the price of the item

        System.out.print("Enter the price of the item: ");



        // Check if the input is a valid double number

        if (in.hasNextDouble()) {

            // Read the valid double value into itemPrice

            itemPrice = in.nextDouble();

            in.nextLine(); // Clear the input buffer newline



            // If the item price is $100 or more, shipping is free

            if (itemPrice >= 100.0) {

                shippingCost = 0.0;

            }

            // Otherwise, shipping is 2% of the item price

            else {

                shippingCost = itemPrice * 0.02;

            }



            // Calculate the total cost by adding shipping cost to the item price

            totalCost = itemPrice + shippingCost;



            // Output the computed shipping cost and the total price

            System.out.println("Shipping Cost: $" + shippingCost);

            System.out.println("Total Price: $" + totalCost);

        }

        // If the input is not a valid double, handle the error gracefully

        else {

            String trash = in.nextLine(); // Read bad input as a String

            System.out.println("Error: '" + trash + "' is not a valid price.");

            System.out.println("Please run the program again and enter a valid number.");

        }

    }

}
package _03_HouseCatalogue;

// Define readInputs
// Define writeOutputs
// Define non-void method calculatePrice
// Ctrl + shift + minus vs. Ctrl + shift + plus
// calling methods from inside other methods
import java.util.Scanner;

class House {

    public int propertyNumber;
    public String propertyType;
    public int stories;
    public int bedrooms;
    public double marketValue;

    //This reads all property data
    public void readInputs() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[Q1] What is the property number? ");
        propertyNumber = keyboard.nextInt();

        System.out.print("[Q2] What is the property type? ");
        propertyType = keyboard.next();

        System.out.print("[Q3] Enter number of stories:");
        stories = keyboard.nextInt();

        System.out.print("[Q4] Enter number of bedrooms? ");
        bedrooms = keyboard.nextInt();

        System.out.print("[Q5] Enter property value? ");
        marketValue = keyboard.nextDouble();
    }

    // This metod displays all property information
    public void display() {
        System.out.println("Here are the details: ");
        System.out.println("Property #: " + propertyNumber);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Market Value: " + marketValue);

        // This is how we call methods from inside anotehr method
        System.out.println("The new value in 10 years: " + calculatePriceIn10Years());
        System.out.println();
    }

    // This method calculates the property value after 10 years and returns a double value
    public double calculatePriceIn10Years() {
        double newValue = marketValue * 10;
        return newValue;
    }

}

public class House_Catalogue_03 {

    public static void main(String[] args) {

        // This is to create a new house (an object) from class House
        House singleHouse = new House();

        System.out.println("\nWelcome, here are the houses we have: ");

        // This is how to call methods
        singleHouse.readInputs();
        singleHouse.display();
    }
}

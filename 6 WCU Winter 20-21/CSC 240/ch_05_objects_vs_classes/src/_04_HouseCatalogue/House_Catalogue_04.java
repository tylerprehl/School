package _04_HouseCatalogue;

// Define another calculate price method that takes an argument.
import java.util.Scanner;

class House {

    public int propertyNumber;
    public String propertyType;
    public int stories;
    public int bedrooms;
    public double marketValue;
    public int investmentYears;

    public void readInputs() {

        System.out.println("\nWelcome to PhillySmartChoice, Please enter the following: ");

        System.out.println();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[Q1] Enter property number: ");
        propertyNumber = keyboard.nextInt();

        System.out.print("[Q2] Enter property type: ");
        propertyType = keyboard.next();

        System.out.print("[Q3] Enter number of stories: ");
        stories = keyboard.nextByte();

        System.out.print("[Q4] Enter number of bedrooms: ");
        bedrooms = keyboard.nextInt();

        System.out.print("[Q5] Enter property value: ");
        marketValue = keyboard.nextDouble();

        System.out.print("[Q6] Enter years of Investment: ");
        investmentYears = keyboard.nextInt();
    }

    // This metod displays all property information
    public void display() {
        System.out.println();
        System.out.println("Here are the details: ");
        System.out.println("Property #: " + propertyNumber);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Market Value: " + marketValue);
        System.out.println("The property value in 10 years: " + calculatePriceIn10Years());
        System.out.println("The property value in " + investmentYears + " years: " + calculatePriceInGivenYears(investmentYears));
        System.out.println();
    }

    // This method calculates the property value after 10 years
    public double calculatePriceIn10Years() {
        double priceIn10Years = marketValue * 10;
        return priceIn10Years;
    }

    // This method calculates the property value after a given numer of years
    public double calculatePriceInGivenYears(int numberOfYears) {
        double futureValue = marketValue * numberOfYears;
        return futureValue;
    }
}

public class House_Catalogue_04 {

    public static void main(String[] args) {

        // This is to create a new house (an object) from class House
        House singleHouse = new House();

        // This is how to call methods
        singleHouse.readInputs();
        singleHouse.display();
    }
}

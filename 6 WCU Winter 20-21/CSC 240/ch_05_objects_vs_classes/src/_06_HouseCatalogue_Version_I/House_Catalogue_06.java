// Define Setters and Getters
// public Vs. private
// Setters are needed for validation.
package _06_HouseCatalogue_Version_I;

public class House_Catalogue_06 {

    public static void main(String[] args) {

        // This is to create a new house (an object) from class House
        House singleHouse = new House();

        // This is how to call methods
        singleHouse.readInputs();
        singleHouse.display();
        singleHouse.calculatePriceInGivenYears();

        // Look now how we can access data section directly since they are public
        System.out.println("\nWith public access to instance, we've changed data section to:");
        singleHouse.propertyNumber = 111111;
        singleHouse.propertyType = "Condo";
        singleHouse.stories = 1;
        singleHouse.bedrooms = 1;
        singleHouse.marketValue = 5000;
        singleHouse.investmentYears = 3;
        singleHouse.display();

        // This is how we use setters to set data for objects.
        System.out.println("With public access to verifiers, we've used verifiers to change data section to: ");
        singleHouse.verifyPropertyNumber();    // try a negative number and see the error message
        singleHouse.verifyPropertyType();
        singleHouse.verifyStories();
        singleHouse.verifyBedrooms();
        singleHouse.verifyMarketValue();
        singleHouse.verifyYears();
        singleHouse.display();
    }
}

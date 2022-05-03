package _02_HouseCatalogue;

class House {

    public int propertyNumber;
    public String propertyType;
    public int stories;
    public int bedrooms;
    public double marketValue;

    // This metod displays all property information
    public void display() {
        System.out.println(); // I usually add this new empty lien for pretty format
        System.out.println("Property #: " + propertyNumber);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Market Value: " + marketValue);
        System.out.println(); // I usually add this new empty lien for pretty format
    }
}

public class House_Catalogue_02 {

    public static void main(String[] args) {

        // This is to create a new house (an object) from class House
        House singleHouse = new House();

        // This will create a proeprty with default values of its instacne variables
        House townHouse = new House();

        // This is how to assign values to the singleHouse instance varaibles
        singleHouse.propertyNumber = 283795;
        singleHouse.propertyType = "Single Family";
        singleHouse.stories = 1;
        singleHouse.bedrooms = 4;
        singleHouse.marketValue = 652880;

        townHouse.propertyNumber = 99988877;
        townHouse.propertyType = "TownHouse";
        townHouse.stories = 3;
        townHouse.bedrooms = 4;
        townHouse.marketValue = 77770;

        System.out.println("Welcome, here are the houses we have: ");

        // This is how to call methods
        singleHouse.display();
        townHouse.display();
    }
}

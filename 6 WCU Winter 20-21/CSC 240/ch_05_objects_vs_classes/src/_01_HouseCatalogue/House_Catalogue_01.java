package _01_HouseCatalogue;

class House {

    int propertyNumber;
    String propertyType;
    int stories;
    int bedrooms;
    double marketValue;
}

public class House_Catalogue_01 {

    public static void main(String[] args) {

        //create a new house (an object) from class House
        House singleHouse = new House();

        //ssign values to house varaibles
        singleHouse.propertyNumber = 125;
        singleHouse.propertyType = "Single Family";
        singleHouse.stories = 5;
        singleHouse.bedrooms = 4;
        singleHouse.marketValue = 652880;
        System.out.println("Welcome, here are the houses we have: ");

        // print the object address
        System.out.println(singleHouse);
        System.out.println();
        
        // print the object instance variables
        System.out.println("Properties Inventory");
        System.out.println("Property #: " + singleHouse.propertyNumber);
        System.out.println("Property Type: " + singleHouse.propertyType);
        System.out.println("Stories: " + singleHouse.stories);
        System.out.println("Bedrooms: " + singleHouse.bedrooms);
        System.out.println("Market Value: " + singleHouse.marketValue);
    }
}

// Adding Precondition, and PostConditions to methods definitions.
package _05_HouseCatalogue;

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

    /**
     * Precondition: The instance variables of the calling object have values.
     * Postcondition: The data stored in (the instance variables of) the
     * receiving object have been written to the screen
     *
     */
    public void display() {
        System.out.println();
        System.out.println("Property #: " + getPropertyNumber());
        System.out.println("Property Type: " + getPropertyType());
        System.out.println("Stories: " + getStories());
        System.out.println("Bedrooms: " + getBedrooms());
        System.out.println("Market Value: " + getMarketValue());
        System.out.println("Years Value: " + getYears());
        System.out.println("The property value in 10 years: " + calculatePriceIn10Years());
        System.out.println("The property value in " + investmentYears + " years: " + calculatePriceInGivenYears(investmentYears));
        System.out.println();
    }

    /**
     * Precondition: years is a nonnegative number. Postcondition: Returns the
     * projected future price of the calling object after the specified number
     * of years.
     */
    public double calculatePriceInGivenYears(int numberOfYears) {
        double futureValue = marketValue * numberOfYears;
        return futureValue;
    }

    // This method calculates the property value after 10 years
    public double calculatePriceIn10Years() {
        double priceIn10Years = marketValue * 10;
        return priceIn10Years;
    }

    public void setPropertyNumber(int newPropertyNumber) {
        propertyNumber = newPropertyNumber;
    }

    public void setPropertyType(String newPropertyType) {
        propertyType = newPropertyType;
    }

    public void setStories(int newStories) {
        stories = newStories;
    }

    public void setBedrooms(int newBedrooms) {
        bedrooms = newBedrooms;
    }

    public void setMarketValue(double newMarketValue) {
        marketValue = newMarketValue;
    }

    public void setYears(int newYearsValue) {
        investmentYears = newYearsValue;
    }

    public int getPropertyNumber() {
        return propertyNumber;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public int getStories() {
        return stories;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public int getYears() {
        return investmentYears;
    }
}

public class House_Catalogue_05 {

    public static void main(String[] args) {

        // This is to create a new house (an object) from class House
        House singleHouse = new House();

        // This is how to call methods
        singleHouse.readInputs();
        singleHouse.display();

        System.out.println("\nHere are the property new details using setters: ");

        // This is how we use setters to set data for objects.
        // Be careful. Settesr are powerful. 
        // See how I was able to change all user data to something else.
        // Of course, yo ucan read these arguments from the user
        //singleHouse.propertyNumber=555;
        singleHouse.setPropertyNumber(-888555);
        singleHouse.setPropertyType("condo");
        singleHouse.setStories(4);
        singleHouse.setBedrooms(3);
        singleHouse.setMarketValue(89500000);

//        // call display method one more time
        singleHouse.display();
    }
}

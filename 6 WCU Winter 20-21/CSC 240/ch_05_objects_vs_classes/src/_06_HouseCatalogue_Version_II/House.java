// Adding access modifires of publci to data and methods
// Setters are needed for validation.
// Change setters to verifiers
// Change getters to retrievers
package _06_HouseCatalogue_Version_II;

import java.util.Scanner;

public class House {

    private int propertyNumber;
    private String propertyType;
    private int stories;
    private int bedrooms;
    private double marketValue;
    private int investmentYears;

    public void readInputs() {
        System.out.println("\nWelcome to PhillySmartChoice, Please enter the following: \n");

        verifyPropertyNumber();
        verifyPropertyType();
        verifyStories();
        verifyBedrooms();
        verifyMarketValue();
        verifyYears();
    }

    public void display() {
        System.out.println();
        System.out.println("\tProperty #: " + retrievePropertyNumber());
        System.out.println("\tProperty Type: " + retrievePropertyType());
        System.out.println("\tStories: " + retrieveStories());
        System.out.println("\tBedrooms: " + retrieveBedrooms());
        System.out.println("\tMarket Value: " + retrieveMarketValue());
        System.out.println("\tYears: " + retrieveYears());
    }

    public void calculatePriceInGivenYears() {
//        System.out.println("Let's calculate the prpoerty value after some years");
//        System.out.print("For how many years you are investing in this property?: ");
//
//        Scanner keyboard = new Scanner(System.in);
//        int numberOfYears = keyboard.nextInt();

        double futureValue = marketValue * investmentYears;
        System.out.println("\tThe  property value in "
                + investmentYears + " years: " + futureValue);
    }

    // It was like this: public void setPropertyNumber(int newPropertyNumber)
    // But I changed it to reflect the concept of verifying rather thatn setting
    private void verifyPropertyNumber() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[Q1] Enter property number: ");
        propertyNumber = keyboard.nextInt();

        if (propertyNumber <= 0) {
            System.out.println("ERROR: Invalid Property Number .");
            System.exit(0);
        }
    }

    private void verifyPropertyType() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q2] Enter property type: ");
        propertyType = keyboard.next();
    }

    private void verifyStories() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q3] Enter number of stories: ");
        stories = keyboard.nextInt();

        if (stories <= 0) {
            System.out.println("ERROR: Invalid Stories Number .");
            System.exit(0);
        }
    }

    private void verifyBedrooms() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q4] Enter number of bedrooms: ");
        bedrooms = keyboard.nextInt();

        if (bedrooms <= 0) {
            System.out.println("ERROR: Invalid bedrooms Number .");
            System.exit(0);
        }

    }

    private void verifyMarketValue() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q5] Enter property value: ");
        marketValue = keyboard.nextInt();

        if (marketValue <= 0) {
            System.out.println("ERROR: Invalid bedrooms Number .");
            System.exit(0);
        }
    }

    private void verifyYears() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q6] Enter years of Investment: ");
        investmentYears = keyboard.nextInt();

        if (investmentYears <= 0) {
            System.out.println("ERROR: Invalid Years Number .");
            System.exit(0);
        }
    }

    // It was like this:  public int getPropertyNumber()
    // But I changed it to reflect the concept of retrieving rather thatn getting
    private int retrievePropertyNumber() {
        return propertyNumber;
    }

    private String retrievePropertyType() {
        return propertyType;
    }

    private int retrieveStories() {
        return stories;
    }

    private int retrieveBedrooms() {
        return bedrooms;
    }

    private double retrieveMarketValue() {
        return marketValue;
    }

    private double retrieveYears() {
        return investmentYears;
    }
}

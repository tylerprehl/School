package _07_House_Catalogue;

import java.util.Scanner;

class House {

    private int propertyNumber;
    private String propertyType;
    private int stories;
    private int bedrooms;
    private double marketValue;
    private int investmentYears;

    House() {
    }

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

    public void verifyYears() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q6] Enter years of Investment: ");
        investmentYears = keyboard.nextInt();

        if (investmentYears <= 0) {
            System.out.println("ERROR: Invalid Years Number .");
            System.exit(0);
        }
    }

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

    public boolean matches(House target) {
        return ((propertyNumber == target.propertyNumber)
                && (propertyType.equalsIgnoreCase(target.propertyType)
                && (stories == target.stories)
                && bedrooms == target.bedrooms)
                && (marketValue == target.marketValue)
                && (investmentYears == target.investmentYears));
    }
}

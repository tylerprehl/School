package _07_House_Catalogue;
// Define equal ()method

public class House_Catalogue_07 {

    public static void main(String[] args) {

        // We will create two objects and test if they are equal
        House tom = new House();
        House jerry = new House();

        tom.readInputs();
        jerry.readInputs();

        tom.display();
        jerry.display();

        if (tom == jerry) {
            System.out.println("Both houses match with ==.");
        } else {
            System.out.println("Both houses didn't match with ==.");
        }

        if (tom.matches(jerry)) {
            System.out.println("Both houses match with the method equals.");
        } else {
            System.out.println("Both houses didn't match with the method equals.");
        }
    }
}

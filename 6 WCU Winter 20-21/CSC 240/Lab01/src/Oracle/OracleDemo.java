package Lab01;

// this example demonstrates how to use private methods.

import java.util.Scanner;

class Oracle {

    private String answer = "The answer is in your heart.";
    private String question;
    private String advice;

    public void chat() {
        System.out.println();
        System.out.print("I am the oracle. I will answer any one-line question.");

        Scanner keyboard = new Scanner(System.in);
        String response;
        do {
            ask();

            System.out.println();
            System.out.print("Do you wish to ask another question?: ");
            response = keyboard.next();

        } while (response.equalsIgnoreCase("yes"));

        System.out.println("The oracle will now rest.");
    }

    private void ask() {
        System.out.println();
        System.out.print("What is your question?: ");

        Scanner keyboard = new Scanner(System.in);
        question = keyboard.nextLine();

        seekAdvice();

        System.out.println();
        System.out.println("You asked the question: " + question);
        System.out.println("Now, here is my answer: " + answer);
    }

    private void seekAdvice() {
        System.out.println();
        System.out.println("Hmm, I need some help on that.");
        System.out.print("Please give me one line of advice: ");
        Scanner keyboard = new Scanner(System.in);
        advice = keyboard.nextLine();
        System.out.println("Thank you. That helped a lot.");
    }

}

public class OracleDemo {

    public static void main(String[] args) {
        Oracle delphi = new Oracle();
        delphi.chat();
      
        // This is invalid. You can not access ask since it is private.
         //delphi.ask();
         //delphi.seekAdvice();

        //This is invalid. accessing a private instance variable.
        //delphi.answer="This is a joke";
    }
}

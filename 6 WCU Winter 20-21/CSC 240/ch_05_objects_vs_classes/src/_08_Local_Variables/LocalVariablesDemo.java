package _08_Local_Variables;

//A toy program to illustrate how local variables behave.
class LocalVariables {
    public double amount;
    public double rate;

    public void showNewBalance() {
        double newAmount = amount + (rate / 100.0) * amount;
        System.out.println("Using showNewBalance(), new amount is $"
                + newAmount);
    }
}
public class LocalVariablesDemo {
    public static void main(String[] args) {
        LocalVariables myAccount = new LocalVariables();
        myAccount.amount = 100.00;
        myAccount.rate = 5;

        myAccount.showNewBalance(); // 105

        double newAmount = 800.00;
        System.out.println("From inside the main(), new amount is $" + newAmount);
    }
}
